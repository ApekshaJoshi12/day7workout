import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Rahul", "9876543210");
        phoneBook.put("Aman", "9876501234");
        phoneBook.put("Kiran", "9876512345");
        phoneBook.put("Neha", "9876523456");
        phoneBook.put("Riya", "9876534567");

        if (phoneBook.containsKey("Rahul")) {
            System.out.println("Rahul's Number: " + phoneBook.get("Rahul"));
        } else {
            System.out.println("Contact not found");
        }
    }
}