package labsheet10;

public class FicttionBook implements Author,Book{

	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	private String fname;
	private String lname;
	
	FicttionBook(String title,int publicYear){
		this.title=title;
		this.publicYear=publicYear;
		
	}
	
	public void setAuthorName(String name) {
		author_name = name;
		int space = author_name.indexOf(" ");
		fname = author_name.substring(0,space);
		lname = author_name.substring(space+1);
		
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return this.email;
	}
	@Override
	public String getLastName() {
		return this.lname.toUpperCase();
	}
	@Override
	public String getFistname() {
		return this.fname.toUpperCase();
	}
	
	@Override
      public boolean checkEmail() {
		if(this.email.endsWith("@hotmaile.com"))
			return true;
		return false;
	}	
	@Override
	public String getTitle(){
		return this.title;
	}
	@Override
	public int totalpublicYear() {
		return 2025 - this.publicYear;		
	}
	
	
	


	public String toString() {
		return getTitle()+"Write by"+getLastName().substring(0,1)+"."+getFistname()+"("+getEmail()+")"+"\npublic for "+totalpublicYear()+"year(s).";
		
	}
}


















