import java.util.LinkedHashMap;

public class ProductList {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> products = new LinkedHashMap<>();

        products.put("Laptop", 60000);
        products.put("Mobile", 25000);
        products.put("Headphones", 3000);
        products.put("Keyboard", 1500);
        products.put("Mouse", 700);

        for (String product : products.keySet()) {
            System.out.println(product + " : " + products.get(product));
        }
    }
}