/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;
import java.util.List;
/**
 *
 * @author Weslei
 */
public interface IOrder {
    List<String> getOrderInformations();
    String getStatus(User user);
}
