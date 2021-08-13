package proxy;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Weslei
 */
public class Order implements IOrder{
    
    private Integer id;
    private String description;
    private String status;
    private Float value;
    public String valueToString;

    public Order(int id) {
        this.id = id;
        Order order = BD.getOrder(id);
        this.description = order.description;
        this.status = order.status;
        this.value = order.value;
    }

    public Order(Integer id, String description, String status, Float value) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public List<String> getOrderInformations() {
        valueToString = Float.toString(this.value);
        return Arrays.asList(this.description, valueToString);
    }

    @Override
    public String getStatus(User user) {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
}
