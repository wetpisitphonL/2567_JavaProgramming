package labsheet06;
import java.util.*;
public class TestEmployeeInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		System.out.println("Enter for Employee 1 Details:");
		System.out.print("Name: ");
		String empName1 = scan.nextLine();
		System.out.print("Hours Works: ");
		int empHoursWorks1 = scan.nextInt();
		System.out.print("HoursRate: ");
		double empHoursRate1=scan.nextDouble();
		
		emp1.setEmployeeDetaile(empName1, empHoursWorks1, empHoursRate1);
		//System.out.println("-----------------------------------------");
		Line('-');
		emp1.displayEmployeeDetails();
		Line('-');
		
		scan.nextLine();
		
		System.out.println("Enter for Employee 2 Details:");
		System.out.print("Name: ");
		String empName2 = scan.nextLine();
		System.out.print("Hours Works: ");
		int empHoursWorks2 = scan.nextInt();
		System.out.print("HoursRate: ");
		double empHoursRate2=scan.nextDouble();
		
		emp2.setEmployeeDetaile(empName2, empHoursWorks2, empHoursRate2);
		Line('-');
		emp2.displayEmployeeDetails();
		scan.close();

	}
public static void Line(char symbol) {
	System.out.println("-----------------------------------------");
	for(int i=1;i<50;i++) {
		System.out.print(symbol);
	}
	
	
}
}
