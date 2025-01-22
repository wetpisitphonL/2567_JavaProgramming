package labsheet07_Encapsulation;

public class DemoCar {

	public static void main(String[] args) {
		Car car = new Car("Chevrolet","Cruze",2009,150000.0 );		
		car.printDetails();		
		System.out.println();
		
		System.out.println("\nUpdate car details");
		car.setCompanyName("Tesla");
		car.setModelname("PCX");
		car.setYear(2015);
		
		car.setCompanyName("");
		car.setModelname(null);
		car.setYear(1800);
		
		car.printDetails();

	}

}
