package Table;

public class OrderItem {
    private int orderNo;
    private String productName;
    private double price;
    private int quantity;
    private boolean editable; // to control row edit mode

    public OrderItem(int orderNo, String productName, double price, int quantity) {
        this.orderNo = orderNo;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.editable = false;
    }

    // Getters & Setters
    public int getOrderNo() { return orderNo; }
    public void setOrderNo(int orderNo) { this.orderNo = orderNo; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public boolean isEditable() { return editable; }
    public void setEditable(boolean editable) { this.editable = editable; }
}
