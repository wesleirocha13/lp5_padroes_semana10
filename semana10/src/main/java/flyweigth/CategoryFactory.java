package flyweigth;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Weslei
 */
public class CategoryFactory {
    private static Map<String, Category> categories = new HashMap<>();

    public static Category getCategory(String name, String description) {
        Category category = categories.get(name);
        if (category == null) {
            category = new Category(name, description);
            categories.put(name, category);
        }
        return category;
    }

    public static int getTotalCategories() {
        return categories.size();
    }
}
