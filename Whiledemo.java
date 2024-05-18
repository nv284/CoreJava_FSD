package weekTwo;

public class Whiledemo {
    public static void main(String[] args) {
        int x=10 , y= 20 ;
        while(x == y);
        System.out.println("Mid value is : "+ x );

        int num =1 ; int sum = 0;
        while(num <=10){
            if(num %2 ==0){
                sum = sum + num ;
            }
            num ++;
        }
        System.out.println("Sum of even number between 1 and 10 "+ sum );
    }
    
}
