package proxy;

import java.util.List;

/**
 *
 * @author Weslei
 */
public class OrderProxy implements IOrder{
     private Order order;

    private Integer id;

    public OrderProxy(Integer id) {
        this.id = id;
    }

    @Override
    public List<String> getOrderInformations() {
        if (this.order == null) {
            this.order = new Order(this.id);
        }
        return this.order.getOrderInformations();
    }

    @Override
    public String getStatus(User user) {
        if (this.order == null) {
            this.order = new Order(this.id);
        }
        return this.order.getStatus(user);
    }
    
    public void setStatus(User user, String status){
        if (!user.isAdmin()) {
            throw new IllegalArgumentException("Usuario nao autorizado");
        }
        if (this.order == null) {
            this.order = new Order(this.id);
        }
        this.order.setStatus(status);
    }
}
