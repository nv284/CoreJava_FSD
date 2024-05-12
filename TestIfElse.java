import java.util.Scanner;

public class TestIfElse {
    public static void main(String[] args) 
{ 	
// Create an object of Scanner class to take input.
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the marks of Physics ");
   int phyMarks = sc.nextInt();
   System.out.println("Enter the marks of Chemistry ");
   int chemMarks = sc.nextInt();
   System.out.println("Enter the marks of Maths ");
   int mathsMarks = sc.nextInt();
   System.out.println("Enter the marks of English ");
   int engMarks = sc.nextInt();
   System.out.println("Enter the marks of Computer ");
   int compMarks = sc.nextInt();
 
// Find out the total marks of five subjects.
   float totalMarks = phyMarks + chemMarks + mathsMarks + engMarks + compMarks;
   System.out.println("Total marks in five subjects: " +totalMarks);
   float myPer = totalMarks /5;
   System.out.println("My percentage: " +myPer);

// Checking percentage to find grade using if else statement.
   if(myPer >= 80) { 
    System.out.println("Grade A");	
   }
   else {
      System.out.println("Grade B");	
   }
  }
}
