package weekTwo;

import java.util.Scanner;

public class OneD {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6}; // int arr[] = new int[5];
        for(int i = 0 ; i<arr.length ;i++){
              System.err.println(arr[i]+"");
        }
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

    System.out.println("Enter length of Array: ");
    int arrLength = scan.nextInt();
    int [] a = new int[arrLength];
    System.out.println("Enter elements of Array: ");
    for (int i = 0; i < arrLength; i++) {
        // taking array input
        a[i] = scan.nextInt();
      }
      System.out.println("One dimensional array elements are:");
      for (int i = 0; i < arrLength; i++) {
        // printing array elements
        System.out.print(a[i] + " ");
      }

    }
    
}
