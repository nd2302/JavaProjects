package JavaProjects;
//GPA Calculator - Nishant Dash
import java.text.DecimalFormat;
import java.util.Scanner;

public class GPACalculator {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
	    
	    Integer totalPoints = 0;
	    Integer totalCredits = 0;
	    int n, i;
	    boolean moreClasses = false;
		System.out.println("----------------GPA Calculator----------------");
		System.out.println("----------------By Nishant Dash---------------");
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number of subjects: ");
        n=obj.nextInt();
	    
	    for(i=0;i<n;i++){
		    System.out.println("Subject #"+(i+1)+":");
		    Integer credits = 0;
		    boolean validCredits = true;
		    do {
		    	validCredits = true;
		    	
			    System.out.println("Enter number of credits:");
			    String creditsString = scanner.nextLine();  
			    
			    try {
			    	credits = Integer.parseInt(creditsString);
			    }
			    catch (NumberFormatException nfe){
				    System.out.println("Please enter a valid integer");
				    validCredits = false;
			    }
		    }
		    while (!validCredits);
		    
		    boolean validGrade = true;
	
		    Integer gradeValue = 0;
		    String grade = "";
		    do {
		    	validGrade = true;
		    	
			    System.out.println("Enter grade:");
			    grade = scanner.nextLine();  
			    
			    if (grade.equalsIgnoreCase("A+")) {
			    	gradeValue = 10;
			    } else if (grade.equalsIgnoreCase("A")) {
			    	gradeValue = 9;
			    } else if (grade.equalsIgnoreCase("B")) {
			    	gradeValue = 8;
			    } else if (grade.equalsIgnoreCase("C")) {
			    	gradeValue = 7;
			    } else if (grade.equalsIgnoreCase("D")) {
			    	gradeValue = 6;
			    }
				else if (grade.equalsIgnoreCase("F")) {
			    	gradeValue = 0;
			    } else {
				    System.out.println("You didn't enter a valid grade :(");
				    validGrade = false;
			    }
		    }
		    while (!validGrade);
		    Integer points = gradeValue * credits; 
		    totalPoints += points;
		    totalCredits += credits;  
		}
	    DecimalFormat df = new DecimalFormat("0.0000");
	    Double gpa = Double.valueOf(totalPoints) / Double.valueOf(totalCredits);
	    System.out.println("Credits: " + totalCredits);  
	    System.out.println("Points: " + totalPoints);  
	    System.out.println("GPA: " + df.format(gpa));  
	    scanner.close();
	}

}