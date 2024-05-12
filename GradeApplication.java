import java.util.Scanner;

public class GradeApplication {
    public static void main(String[] args) 
    {
       int per = 0;	
    // Create an object of Scanner class to take an input.
       Scanner sc = new Scanner(System.in);	
     
       System.out.println("Enter your total marks of five subjects:");
       int total  = sc.nextInt();
    
       if(total <= 500) {
            per = total/5;
            System.out.println("Your percentage: " +per);
        } else {
            System.out.println("Invalid marks");	
        }
    
       int i = per/10;
       switch(i) {
          case 9:
              System.out.println("Grade A+");
              break;
          case 8:
              System.out.println("Grade A");	
              break;
          case 7:
              System.out.println("Grade B+");
              break;
          case 6:
              System.out.println("Grade B");
              break;
          case 5:
              System.out.println("Grade C");
              break;
          case 4:
              System.out.println("Grade D");
              break;
          case 3:
              System.out.println("Fail");	
              break;
       }
    }
}