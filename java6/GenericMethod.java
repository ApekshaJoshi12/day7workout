public class GenericMethod {

    public static <T> void printArray(T[] array) {

        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        Integer numbers[] = {10, 20, 30};
        String names[] = {"Rahul", "Aman", "Kiran"};

        printArray(numbers);
        printArray(names);
    }
}