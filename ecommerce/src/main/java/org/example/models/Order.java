package org.example.models;


public class Order {
    int orderId;
    int userId;
    String orderDate;
    String orderNumber;
    String orderDetails;
    Boolean isOrderDelivered;

    public Order(){}

    public Order(int orderId, int userId, String orderDate, String orderNumber, String orderDetails, boolean isOrderDelivered){
        this.orderId          = orderId;
        this.userId           = userId;
        this.orderDate        = orderDate;
        this.orderNumber      = orderNumber;
        this.orderDetails     = orderDetails;
        this.isOrderDelivered = isOrderDelivered;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Boolean getOrderDelivered() {
        return isOrderDelivered;
    }

    public void setOrderDelivered(Boolean orderDelivered) {
        isOrderDelivered = orderDelivered;
    }
}
