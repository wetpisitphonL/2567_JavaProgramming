package labsheet06;

public class Product {
	private String productname;
	private double Hprice;
	private double HvatRate;
	
	public void setProductDetails(String Name, double price, double vatRate) {
		productname = Name;
		Hprice = price;
		HvatRate = vatRate;
	}
	public double calculateTotalprice() {
		return Hprice + (Hprice * HvatRate/100);								
	}
	
	public void displayProductDetalis() {
		System.out.println("Product details: ");
		System.out.println("Name "+ productname);
		System.out.println("price Before Vat: "+ Hprice);
		System.out.println("Price after vat: "+calculateTotalprice());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
