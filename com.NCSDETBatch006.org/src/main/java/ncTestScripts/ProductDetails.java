package ncTestScripts;

public class ProductDetails {
	
	String pproductname;
	String pSKU;
	String pprice;
	ProductDetails(String productname,String SKU,String price){
		this.pproductname = productname;
		this.pSKU = SKU;
		this.pprice = price;	
	}
   public static void main(String[] args) {
	   ProductDetails product1 = new ProductDetails("Apple MacBook Pro 13-inch","AP_MBP_13","$1800");
	   System.out.println(product1.pproductname);
	    System.out.println(product1.pSKU); 
		System.out.println(product1.pprice);
		
		 ProductDetails product2 = new ProductDetails("Samsung Series 9 NP900X4C Premium Ultrabook","SM_900_PU","$1590");
		   System.out.println(product2.pproductname);
		    System.out.println(product2.pSKU); 
			System.out.println(product2.pprice);
			
			
			 ProductDetails product3 = new ProductDetails("HP Spectre XT Pro UltraBook","HP_SPX_UB","$1350");
			   System.out.println(product3.pproductname);
			    System.out.println(product3.pSKU); 
				System.out.println(product3.pprice);
				

				 ProductDetails product4 = new ProductDetails("Lenovo Thinkpad X1 Carbon Laptop","LE_TX1_CL","$1360");
				   System.out.println(product4.pproductname);
				    System.out.println(product4.pSKU); 
					System.out.println(product4.pprice);
					
					ProductDetails product5 = new ProductDetails("Asus N551JK-XO076H Laptop","AS_551_LP","$1500");
					   System.out.println(product5.pproductname);
					    System.out.println(product5.pSKU); 
						System.out.println(product5.pprice);
					
					
	}

}
