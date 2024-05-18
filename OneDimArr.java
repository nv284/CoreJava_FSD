package weekTwo;

import java.util.Scanner;

public class OneDimArr {
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("in how many subject have you givem exams ?");
        int n = sc.nextInt();

        int [] marks = new int[n];
        System.out.println("Enter your marks obtained in subjects:"); 
        for (int i = 0; i < n; i++) {
             marks[i] =sc.nextInt();
        }
        int total = 0;
        for(int i = 0;i<n ;i++){
            total = total + marks[i];
        }
        System.out.println("Total Marks = "+total);
    }
}
