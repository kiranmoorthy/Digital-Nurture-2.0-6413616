import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product(105, "Headphones", "Electronics"),
                new Product(203, "Backpack", "Bags"),
                new Product(309, "Keyboard", "Accessories"),
                new Product(120, "T-shirt", "Apparel"),
                new Product(150, "Shoes", "Footwear")
        };

        int targetId = 309;

        // Linear Search (usorted)
        System.out.println("Linear Search:");
        Product result1 = SearchUtils.linearSearch(products, targetId);
        System.out.println(result1!=null ? result1 : "Product not found");

        // Binary Search (requires sorted input)
        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
        System.out.println("Binary Search:");
        Product result2 = SearchUtils.binarySearch(products, targetId);
        System.out.println(result2 != null ? result2 : "Product not found.");

    }
}