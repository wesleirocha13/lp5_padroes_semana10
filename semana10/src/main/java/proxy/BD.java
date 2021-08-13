package proxy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Weslei
 */
public class BD {
   private static Map<Integer, Order> orders = new HashMap<>();

    public static Order getOrder(Integer id) {
        return orders.get(id);
    }

    public static void addOrder(Order order) {
        orders.put(order.getId(), order);
    } 
}
