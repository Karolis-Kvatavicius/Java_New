package Java_Homework_3.Animal;

public abstract class Animal implements Iterable {
    private int body;
    private boolean hasBrain;

    public Animal(int body, boolean hasBrain) {
        this.body = body;
        this.hasBrain = hasBrain;
    }

    abstract String getType();

    public Animal() {
    }

    public int getBody() {
        return body;
    }

    public boolean getBrain() {
        return hasBrain;
    }
}
