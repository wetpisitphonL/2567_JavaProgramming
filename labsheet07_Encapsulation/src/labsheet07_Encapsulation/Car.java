package labsheet07_Encapsulation;

public class Car {
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	Car(){
		/*companyName ="Unknow";
		modelName = "Unknow";
		year =2000;
		mileage=0.0;*/
		this("Unknown","Unknow",2000,0.0);		
	}
	
	Car(String companyName,String modelName,int year,double mileage){
		this.companyName = companyName;
		this.modelName = modelName;
		
		this.year = year<1886? 2000:year;
		this.mileage =mileage;
		
	}
	
	public void setCompanyName(String companyName) {
		if(companyName !=null && !companyName.trim().isEmpty()) {
			this.companyName = companyName;
		}else {
			System.out.println("Error: invalid company or modelName!");
		}
	}
	
	public void setModelname(String modelName) {
		if(modelName==null || modelName.trim().isEmpty()) {
			System.out.println("Error: Invalid company or model name! ");
		}else {
			this.modelName = modelName;
			
		}						
	}
		
	public void setYear(int year) {
		if(year<1886 ) {
			System.out.println("Error: invalid year!");						
		}else{
			this.year = year;
		}
		
	}
	
	public double getMileage() {
		return mileage;
	}

	public void printDetails() {
		System.out.println("Company Name: "+ companyName);
		System.out.println("Model name: "+modelName);
		System.out.println("Year: "+year);
		
		
	}
	
}
