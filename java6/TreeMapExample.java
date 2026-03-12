import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<String, Integer> students = new TreeMap<>();

        students.put("Rahul", 78);
        students.put("Aman", 85);
        students.put("Kiran", 90);

        for (String name : students.keySet()) {
            System.out.println(name + " " + students.get(name));
        }
    }
}