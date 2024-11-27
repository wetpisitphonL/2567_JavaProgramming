import java.util.*;
import java.text.*;
public class javaclasslab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.print("Input product name:  ");
		String productName= input.nextLine();
		
		System.out.print("Input product unit : ");
		int productUnit = input.nextInt();
		
		System.out.print("Input price per unit : ");
		float  productPrice = input.nextFloat();
		System.out.print("_______________________________________");
		float totalPrice= productUnit * productPrice;
		System.out.println("Total price is "+frm.format(totalPrice)+" baht.");
		
		
		
		
		
		
	}

}
