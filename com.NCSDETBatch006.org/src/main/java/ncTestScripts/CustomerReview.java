package ncTestScripts;

public class CustomerReview {

	String productName;
	String customerName;
	String reviewText;
	int rating;

	public CustomerReview() {
		System.out.println("Reviews");
	}

	public CustomerReview(String productName, String customerName, String reviewText, int rating) {

		this.productName = productName;
		this.customerName = customerName;
		this.reviewText = reviewText;
		this.rating = rating;
		System.out.print(productName + "  ");
		System.out.print(customerName + "  ");
		System.out.print(reviewText + "  ");
		System.out.println(rating + "  ");
	}

	public static void main(String[] args) {
		CustomerReview reviews = new CustomerReview();
		CustomerReview review1 = new CustomerReview("AirPods", "Bob", "Great product, highly recommended!", 5);

		CustomerReview review2 = new CustomerReview("AirPods", "Lisa", "Average product, could be better!", 3);

		CustomerReview review3 = new CustomerReview("AirPods", "Sita", "Okay product, not as expected!", 2);

		CustomerReview review4 = new CustomerReview("AirPods", "Sam", "Terrible product, do not buy!", 1);

	}

}
