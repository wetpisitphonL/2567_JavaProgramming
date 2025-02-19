package labsheet10;
import java.util.*;
public class FIctionDemo {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Book Title: ");
		String bookTitle = scan.nextLine();
		System.out.print("Book publish Year: ");
		int publicYear = scan.nextInt();
		scan.nextLine();
		System.out.print("Author name: ");
		String authorName = scan.nextLine();
		System.out.print("Author Email: ");
		String authorEmail = scan.nextLine();
		
		FicttionBook book1 = new FicttionBook(bookTitle, publicYear);
		book1.setAuthorName(authorName);
		book1.setEmail(authorEmail);
		while(!book1.checkEmail()) {
			System.out.print("Enter Email again: ");
			authorEmail = scan.nextLine();
			book1.setEmail(authorEmail);
			
		}
		
		
		Line();
		System.out.println(book1);

	}
	public static void Line() {
		for(int i=1; i<50;i++)
		
			System.out.println("=");
		System.out.println();
	}

}
