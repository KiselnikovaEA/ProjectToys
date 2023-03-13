
public class Main {
    public static void main(String[] args) {
        Toy t1 = new Toy("5683" , "Медведь", 10, 0.5); // создаём игрушки
        Toy t2 = new Toy("5684" , "Заяц", 4, 0.2);
        Toy t3 = new Toy("5685" , "Лиса", 3, 0.1);
        Toy t4 = new Toy("5686" , "Лев", 5, 0.3);
        Toy t5 = new Toy("5683" , "Медведь", 8, 0.4);

        Lottery lottery = new Lottery(t1, t2, t3, t4, t5);
        lottery.toysLeft();
        lottery.play_lottery();
        lottery.toysLeft();
    }
}