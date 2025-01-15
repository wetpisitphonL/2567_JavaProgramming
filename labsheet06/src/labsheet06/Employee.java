package labsheet06;

public class Employee {
private String name;
private int hourwork;
private double hourlyrate;

public void setEmployeeDetaile(String empName, int hours, double rate) {
	name = empName;
	hourwork = hours;
	hourlyrate = rate;
	
	
}
public double calculateSalary() {
	double salary = hourwork*hourlyrate;
	if(hourwork>40) {
		double bonus=salary*0.10;
		salary +=bonus;
	}
	return salary;	
}
public void displayEmployeeDetails() {
	System.out.println("name"+ name);
	System.out.println("Hourwork"+ hourwork);
	System.out.println("hourly Rate"+ hourlyrate);
	System.out.println("Total Salary"+calculateSalary());
}

}
