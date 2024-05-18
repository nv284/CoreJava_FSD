package weekTwo;

import java.util.Scanner;

public class Pattern {
    
    public static void main(String args[]){

        int rows , col , i , j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        col = sc.nextInt();
        for(i = 1 ; i <= rows ; i++){
            for(j = 1 ; j <= col ; j++){
                System.out.print(" * ");
                
    }
    System.out.println("\n");
}
}
}