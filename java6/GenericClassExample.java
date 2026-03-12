class Box<T> {

    T value;

    void setValue(T value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value: " + value);
    }
}

public class GenericClassExample {
    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        intBox.display();

        Box<String> strBox = new Box<>();
        strBox.setValue("Hello Java");
        strBox.display();
    }
}