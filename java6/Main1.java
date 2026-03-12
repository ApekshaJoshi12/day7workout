import java.util.TreeMap;
class Main1 {
 public static void main(String[] args) {
    TreeMap<String,String> map = new TreeMap<>();
    map.put("key1","value1");
    map.put("key2","value2");
    map.put("key3","value3");
    map.put("key4","value4");
    map.put("key5","value5");
    System.out.println(map);
    System.out.println(map.get("key1"));
    map.remove("key1");
    System.out.println(map);
    System.out.println(map.size());
    map.clear();
    System.out.println(map);
 }    
}