import java.util.Date;

public class CustomerOrder {
    private String ID;
    private String customer;
    private Date orderDate;

    public CustomerOrder(String ID, String customer, Date orderDate) {
        this.ID = ID;
        this.customer = customer;
        this.orderDate = orderDate;
    }

    public String getID() {
        return ID;
    }
    public String getCustomer() {
        return customer;
    }
    public Date getOrderDate() {
        return orderDate;
    }

    
    public void setID(String ID) {
        this.ID = ID;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    
    public void orderDetails() {
        System.out.println("Order ID: " + ID);
        System.out.println("Customer: " + customer);
        System.out.println("Order Date: " + orderDate);
    }

    public static class OnlineOrder extends CustomerOrder {
        private String deliveryAddress;
        private String trackingNumber;
        private String trackingStatus;

        public OnlineOrder(String ID, String customer, Date orderDate, String deliveryAddress, String trackingNumber) {
            super(ID, customer, orderDate);
            this.deliveryAddress = deliveryAddress;
            this.trackingNumber = trackingNumber;
            this.trackingStatus = "Order pending";
        }

        public String getDeliveryAddress() {
            return deliveryAddress;
        }

        public void setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
        }

        public String getTrackingNumber() {
            return trackingNumber;
        }

        public void setTrackingNumber(String trackingNumber) {
            this.trackingNumber = trackingNumber;
        }

        public String getTrackingStatus() {
            return trackingStatus;
        }

        public void setTrackingStatus(String trackingStatus) {
            this.trackingStatus = trackingStatus;
        }

        public int calculateDeliveryTime() {
            if (deliveryAddress.contains("London")) {
                return 2;
            } else {
                return 5;
            }
        }

        public void updateTrackingStatus(String newStatus) {
            this.trackingStatus = newStatus;
            System.out.println("Tracking status updated to: " + newStatus);
        }

        @Override
        public void orderDetails() {
            super.orderDetails();
            System.out.println("Delivery Address: " + deliveryAddress);
            System.out.println("Tracking Number: " + trackingNumber);
            System.out.println("Tracking Status: " + trackingStatus);
            System.out.println("Estimated Delivery Time: " + calculateDeliveryTime() + " days");
        }
    }

    public static void main(String[] args) {
        Date orderDate = new Date();

        CustomerOrder customerOrder1 = new CustomerOrder("01", "Mary Smith", orderDate);
        customerOrder1.orderDetails();

        System.out.println();

        OnlineOrder onlineOrder1 = new OnlineOrder("02", "Joe Bloggs", orderDate, "123 Street, London", "56");
        onlineOrder1.orderDetails();
        
        OnlineOrder onlineOrder2 = new OnlineOrder("03", "Chris Jones", orderDate, "14 North Street, Hastings", "56");
        onlineOrder2.orderDetails();

        System.out.println();

        onlineOrder1.updateTrackingStatus("Shipped");
        onlineOrder1.orderDetails();
    }
}