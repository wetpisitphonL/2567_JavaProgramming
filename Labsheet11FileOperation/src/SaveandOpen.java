import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
public class SaveandOpen extends Employee{

	private String name;
	private String dept;
	
	public void insert()throws IOException {
		Scanner input = new Scanner(System.in);
		
		PrintStream writeFile = new PrintStream(new File("src//txtFIle//employee.txt"));
		String answer;
		do {
			super.header();
			System.out.print("Enter Name: ");
			name=input.next();
			System.out.print("Enter department: ");
			dept=input.next();
			//บัททึกข้อมูลชื่อแผนกในไฟล์มี่กําหนดใว้
			writeFile.println(name+"\t"+dept);
			System.out.print("DO you want to put again?: ");
			answer=input.next();
		}while(answer.equalsIgnoreCase("y"));
	
	}

	public void searchData(){
		try {
			//ใช้classScannerสําหรับเปิด่านไฟล์
			Scanner readFile = new Scanner(new File("src//txtFIle//employee.txt"));
			int i = 0;
			boolean check = false;
			super.header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i+")"+name);
					check = true;
				}
				if(check) {
					super.header();
					System.out.print("Employee in dept "+ super.getDept()+"is"+i+"person(s).");
					System.out.println();
					
				}else {
					System.out.println("\nSorry, no dept: "+super.getDept()+"inFile");
				}
				
			}
			
		}catch(IOException e) {
			System.out.println("\nSorrry FIle not found");
		}
		
	}
		
		
	}

