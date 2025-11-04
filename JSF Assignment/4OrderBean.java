package Table;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="orderBean")
@SessionScoped
public class OrderBean implements Serializable {

    private List<OrderItem> orderList = new ArrayList<>();

    public OrderBean() {
        orderList.add(new OrderItem(1, "Laptop", 55000, 1));
        orderList.add(new OrderItem(2, "Keyboard", 1200, 2));
        orderList.add(new OrderItem(3, "Mouse", 800, 3));
    }

    public List<OrderItem> getOrderList() {
        return orderList;
    }

    public void editRow(OrderItem item) {
        item.setEditable(true);
    }

    public void saveAll() {
        for (OrderItem item : orderList) {
            item.setEditable(false);
        }
        System.out.println("All changes saved to database (simulate here)");
    }
}
