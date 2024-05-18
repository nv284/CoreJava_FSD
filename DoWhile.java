package weekTwo;

public class DoWhile {
    public static void main(String[] args) {
        
        int i=1;
        do{
            if(i==5){
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }while(i<=10);

        for(int j=10 ;j>=1 ;j--){
               if(j==5)
               continue;
               System.out.println(j+ "  ");
        }
    }
}
