import java.util.*;


public class Lab301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	Scanner kb = new Scanner(System.in);
	String txtConcate ="";
	String word;
	
	while(true) {
		System.out.print("enter world: ");
		word =kb.next();
		if(word.equalsIgnoreCase("stop"));{
			System.out.println("Program Terminate");
			break;
		}
		txtConcate += word+" ";
		
		
	}
	System.out.println("txtConcate");
	kb.close();
	}
	
}
