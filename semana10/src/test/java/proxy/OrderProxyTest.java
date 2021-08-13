package proxy;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class OrderProxyTest {
    
    @Before
    public void setUp() {
        BD.addOrder(new Order(1, "Pedido1", "Pendente", 100.0f));
        BD.addOrder(new Order(2, "Pedido2", "Pendente", 200.0f));
    }

    @Test
    public void mustReturnOrderInformations() {
        OrderProxy order = new OrderProxy(1);

        assertEquals(Arrays.asList("Pedido1", "100.0"), order.getOrderInformations());
    }

    @Test
    public void mustReturnOrderStatus() {
        User user = new User("Juca", "admin");
        OrderProxy order = new OrderProxy(2);
        order.setStatus(user, "Aprovado");
        assertEquals("Aprovado", order.getStatus(user));
    }
    
    @Test
    public void mustReturnExceptionUnauthorizedUser() {
        try {
            User user = new User("Joao", "Financeiro");
            OrderProxy order = new OrderProxy(2);
            order.setStatus(user, "Aprovado");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Usuario nao autorizado", e.getMessage());
        }
    }
    
}
