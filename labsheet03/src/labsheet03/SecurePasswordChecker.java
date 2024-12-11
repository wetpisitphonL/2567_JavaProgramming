package labsheet03;
import java.util.*;
public class SecurePasswordChecker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.print("Enter your password(type'exit'to quite):");
			String password = scan.nextLine();
			//Check if user wants to exit
			if(password.equalsIgnoreCase("exit"));
			System.out.print("Program terminated.");
			break;
		}
	}

}
