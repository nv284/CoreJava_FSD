import java.util.Scanner;

public class IfElseDemo{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter the number of copies to be printed ");
        int noOfCopy = s.nextInt();
if(noOfCopy > 0 && noOfCopy <100){
    int pricePercopy = 5;
    System.out.println("price per copy "+ pricePercopy);
    int totalcost = noOfCopy * pricePercopy;
    System.out.println("Total cost is "+totalcost);
}
 else if(noOfCopy >=100 && noOfCopy < 500){
    int pricePercopy = 4;
    System.out.println("price per copy "+ pricePercopy);
    int totalcost = noOfCopy * pricePercopy;
    System.out.println("Total cost is "+totalcost);

 }
 else if(noOfCopy >=500 && noOfCopy<800){
    int pricePercopy = 3;
    System.out.println("price per copy "+ pricePercopy);
    int totalcost = noOfCopy * pricePercopy;
    System.out.println("Total cost is "+totalcost);
 }
 else if(noOfCopy >=800 && noOfCopy <1000){
    int pricePercopy = 2;
    System.out.println("price per copy "+ pricePercopy);
    int totalcost = noOfCopy * pricePercopy;
    System.out.println("Total cost is "+totalcost);
 }
 else{
    int pricePercopy = 1;
    System.out.println("price per copy "+ pricePercopy);
    int totalcost = noOfCopy * pricePercopy;
    System.out.println("Total cost is "+totalcost);
 }

    }
}