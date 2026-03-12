import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {

        String sentence = "java is easy and java is powerful";
        String words[] = sentence.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}