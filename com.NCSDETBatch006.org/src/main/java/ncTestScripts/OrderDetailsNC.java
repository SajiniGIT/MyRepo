package ncTestScripts;

public class OrderDetailsNC {

	int orderNumber;
	String orderStatus;
	String paymentStatus;
	String shippingStatus;
	String customerName;
	String storeName;
	String createdOn;
	double orderTotal;

	public OrderDetailsNC(int orderNumber, String orderStatus, String paymentStatus, String shippingStatus, String customerName,
			String storeName, String createdOn, double orderTotal) {
		
		this.orderNumber = orderNumber;
		this.orderStatus = orderStatus;
		this.paymentStatus = paymentStatus;
		this.shippingStatus = shippingStatus;
		this.customerName = customerName;
		this.storeName = storeName;
		this.createdOn = createdOn;
		this.orderTotal = orderTotal;
		
	}

	public static void main(String[] args) {
		OrderDetailsNC order1 = new OrderDetailsNC(5, "Complete", "Paid", "Delivered", "victoria_victoria@nopCommerce.com", "MyStore", "03/13/2017 4:20:10 AM", 43.50);
		System.out.print("orderNumber: " + order1.orderNumber + "  ");
		System.out.print("orderStatus: " + order1.orderStatus + "  ");
		System.out.print("paymentStatus: " + order1.paymentStatus + "  ");
		System.out.print("shippingStatus: " + order1.shippingStatus + "  ");
		System.out.print("customerName: " + order1.customerName + "  ");
		System.out.print("storeName: " + order1.storeName + "  ");
		System.out.print("createdOn: " + order1.createdOn + "  ");
		System.out.println("orderTotal: " + order1.orderTotal + "  ");
		
		OrderDetailsNC order2 = new OrderDetailsNC(4, "Processing", "Paid", "Shipped", "brenda_lindgren@nopCommerce.com", "MyStore", "03/13/2017 4:20:09 AM", 102.00);
		System.out.print("orderNumber: " + order2.orderNumber + "  ");
		System.out.print("orderStatus: " + order2.orderStatus + "  ");
		System.out.print("paymentStatus: " + order2.paymentStatus + "  ");
		System.out.print("shippingStatus: " + order2.shippingStatus + "  ");
		System.out.print("customerName: " + order2.customerName + "  ");
		System.out.print("storeName: " + order2.storeName + "  ");
		System.out.print("createdOn: " + order2.createdOn + "  ");
		System.out.println("orderTotal: " + order2.orderTotal + "  ");
		
		OrderDetailsNC order3 = new OrderDetailsNC(3, "Pending", "Pending", "Shipping not required", "james_pan@nopCommerce.com", "MyStore", "03/13/2017 4:20:09 AM", 8.80);
		System.out.print("orderNumber: " + order3.orderNumber + "  ");
		System.out.print("orderStatus: " + order3.orderStatus + "  ");
		System.out.print("paymentStatus: " + order3.paymentStatus + "  ");
		System.out.print("shippingStatus: " + order3.shippingStatus + "  ");
		System.out.print("customerName: " + order3.customerName + "  ");
		System.out.print("storeName: " + order3.storeName + "  ");
		System.out.print("createdOn: " + order3.createdOn + "  ");
		System.out.println("orderTotal: " + order3.orderTotal + "  ");
		
		OrderDetailsNC order4 = new OrderDetailsNC(2, "Pending", "Pending", "Not yet shipped", "arthur_holmes@nopCommerce.com", "MyStore", "03/13/2017 4:20:09 AM", 2460.00);
		System.out.print("orderNumber: " + order4.orderNumber + "  ");
		System.out.print("orderStatus: " + order4.orderStatus + "  ");
		System.out.print("paymentStatus: " + order4.paymentStatus + "  ");
		System.out.print("shippingStatus: " + order4.shippingStatus + "  ");
		System.out.print("customerName: " + order4.customerName + "  ");
		System.out.print("storeName: " + order4.storeName + "  ");
		System.out.print("createdOn: " + order4.createdOn + "  ");
		System.out.println("orderTotal: " + order4.orderTotal + "  ");
		
		OrderDetailsNC order5 = new OrderDetailsNC(1, "Processing", "Paid", "Not yet shipped", "steve_gates@nopCommerce.com", "MyStore", "03/13/2017 4:20:09 AM", 1855.00);
		System.out.print("orderNumber: " + order5.orderNumber + "  ");
		System.out.print("orderStatus: " + order5.orderStatus + "  ");
		System.out.print("paymentStatus: " + order5.paymentStatus + "  ");
		System.out.print("shippingStatus: " + order5.shippingStatus + "  ");
		System.out.print("customerName: " + order5.customerName + "  ");
		System.out.print("storeName: " + order5.storeName + "  ");
		System.out.print("createdOn: " + order5.createdOn + "  ");
		System.out.println("orderTotal: " + order5.orderTotal + "  ");


		

	}

}
