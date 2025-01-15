package labsheet06;

public class Student {
	private String name;
	private double[] scores;
	
	public void setStudentDetails(String stdName,double[] stdScores) {
		name = stdName;
		scores = stdScores;
		
	}

	public double calculateAverageScore() {
		double total = 0;
		for(int i=0;i<scores.length;i++) {
			total += scores[i];
			
			
		}
		return total/scores.length; //return average of scores[]
		
						
	}
	
	public String getGrade() {
		double average = calculateAverageScore();
		if(average>=90) {
			return"A";			
		}else if(average>=80) {
			return"B";
		}else if(average>=70) {
			return"c";
		}else if(average>=60) {
			return"D";
		}else {
			return"E";
		}
	}
	public void displayStudentDetails() {
		System.out.println("Name: ");
		System.out.println("Scores: ");
		for(int i=0;i<scores.length;i++) {
			System.out.print(scores[i]+" ");
			
			
		}
		for(double _score : scores) {
			System.out.print(_score+" "); 
			
			
		}	
		System.out.println("\nAverage Score "+ calculateAverageScore());
		System.out.println("Grade"+ getGrade());
		
	}
	
}
