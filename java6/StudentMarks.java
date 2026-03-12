import java.util.HashMap;

public class StudentMarks {
    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Rahul", 85);
        marks.put("Aman", 90);
        marks.put("Kiran", 78);
        marks.put("Neha", 88);
        marks.put("Riya", 92);

        for (String name : marks.keySet()) {
            System.out.println(name + " : " + marks.get(name));
        }
    }
}