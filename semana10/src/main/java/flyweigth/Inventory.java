package flyweigth;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Weslei
 */
public class Inventory {
    private List<Product> products = new ArrayList<>();

    public void register(String productName, String productDescription, String categoryName, String categoryDescription) {
        Category category = CategoryFactory.getCategory(categoryName, categoryDescription);
        Product product = new Product(productName, productDescription, category);
        products.add(product);
    }

    public List<String> getProducts() {
        List<String> result = new ArrayList<String>();
        for (Product product : this.products) {
            result.add(product.getProduct());
        }
        return result;
    }
}
