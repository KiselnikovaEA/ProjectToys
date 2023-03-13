public class Toy {
    private String toyId;
    private String toyName;
    private int count;
    public double frequency;
    public Toy(String id, String name, int count, double frequency) {
        this.toyId = id;
        this.toyName = name;
        this.count = count;
        this.frequency = frequency;
    }
    public double getFrequency() {
        return this.frequency;
    }
    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
    public int getCount() {
        return this.count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public String getName() {
        return this.toyName;
    }
    public String getToyId() {
        return toyId;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id='" + toyId + '\'' +
                ", name='" + toyName + '\'' +
                ", count='" + count + '\'' +
                ", frequency='" + frequency + '\'' +
                '}';
    }
}
