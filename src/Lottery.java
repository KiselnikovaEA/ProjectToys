import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Lottery {
        private List<Toy> stock;
    public Lottery(Toy... toys) {
        this.stock = new ArrayList<>();
        for (Toy toy : toys) {
            addToy(toy);
        }
    }

    public void addToy(Toy newToy) {

        for (Toy toy : stock) {
            if (newToy.getToyId() == toy.getToyId()) {
                System.out.println("Игрушка <" + newToy.getName() + "> уже участвует в розыгрыше");
                return;
            }
        }

        if (newToy.getCount() > 0) {
            stock.add(newToy);
            System.out.println("Игрушка <" + newToy.getName() + "> добавлена в розыгрыш");
        }

    }

    public void toysLeft() {
        System.out.println("Остаток игрушек на складе");
        for (Toy toy : stock) {
            System.out.println("Игрушка: " + toy.getName() + "; Осталось: " + toy.getCount() + ".");
        }
    }

    public void chooseToy() {
        int i = 1;
        System.out.println("Игрушки для розыгрыша:");
        for (Toy toy: stock) {
            System.out.println(i++ + " - " + toy.getName());
        }
    }

    public void play_lottery() {
        chooseToy();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Какую выберете?: ");
            int num = in.nextInt();
            if (num >= 1 && num <= stock.size()) {
                System.out.println("Немного магии...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                double result = Math.random();
                if (stock.get(num - 1).getFrequency() > result) {
                    System.out.println("Поздравляю, Вы выйграли! Получите свою игрушку.");
                    stock.get(num - 1).setCount(stock.get(num - 1).getCount() - 1);
                    if (stock.get(num - 1).getCount() == 0) {
                        stock.remove(num - 1);
                    }
                }
                else {
                    System.out.println("Не повезло, попробуйте вы другой раз.");
                }
                return;
            }
            else {
                System.out.println("Вы ввели неправильный номер, попробуйте ещё.");
            }
        }

    }
}
