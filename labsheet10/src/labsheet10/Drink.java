package labsheet10;

public class Drink {

	private int type;
	private char size;
	
	public Drink(int type, char size ) {
		this.size = size;
		this.type = type;
	}
	public String getTypeName() {
		if(type == 1)return "Hot";
		if(type == 2)return "Cold";
		return null; 
				
	}
}
