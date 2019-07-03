package practice07;

public class Klass {
    private int number;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Klass setNumber(int number) {
        this.number = number;
        return this;
    }

    public String getDisplayName() {
        return String.format("Class %d", this.number);
    }
}
