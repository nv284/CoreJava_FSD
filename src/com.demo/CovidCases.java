import java.util.Scanner;

public class CovidCases {

   public static void main(String args[]){
      String [] countrynames = {"USA" , "India","Brazil","UK" , "France"};
      int totalCases = 0;
      int totalRecoveredCases = 1;
      int activeCases = 2 ;
      int [] []covidCases={
        {66995533 , 43090644 , 23031325},
        {43534534 , 34534534 , 12345678},
        {34534534 , 23456789 , 12345678},
        {12345678 , 12345678 , 12345678},
        {12345666, 57656757,86786686}

      };
      for(int idx = 0; idx<covidCases.length ;idx++){
        System.out.println("Country Name: " + countrynames[idx]);
        System.out.println("--------------------------------- " );
        for(int j=0 ; j<covidCases[idx].length ; j++){
            System.out.print(covidCases[idx][j]+"\t");
            System.out.println("--------------------------------");
        }
        System.out.println();
        System.out.println();
      }
      System.out.println(" Filter Covid Case Data");
      System.out.println("1. Name");
      System.out.println("2. Total Cases");
      System.out.println("3. Recovered Cases");
      System.out.println("4. Active Cases ");

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Your Choice :");
      int Choice = sc.nextInt();
      //sc.close();
      switch (Choice) {
        case 1:
        sc.nextLine();
        System.out.println("Enter name of the country ");
        String name = sc.nextLine();
        int idx = -1 ;
        for(int i = 0 ; i < countrynames.length ; i++){
            if(name.equalsIgnoreCase(countrynames[i])){
                 idx = i;
                 break;  
            }
        }
            if(idx==-1){
                System.out.println("Country Not Found");
            }else{
                for(int element : covidCases[idx]){
                    System.out.print(element+"\t");
                }
                System.out.println();
            }
         break;
        case 2:
        System.out.println("Total Cases ");
        System.out.println("------------------");
        for(int i=0;i<covidCases.length;i++){
            System.out.println(countrynames[i]);
            System.out.println("------------------");
            System.out.print(covidCases[i][totalCases]);
            System.out.println();
            System.out.println();
        }
            break;
         case 3:
         System.out.println("Recovered Cases ");
         System.out.println("------------------");
         for(int i=0;i<covidCases.length;i++){
            System.out.println(countrynames[i]);
            System.out.println("------------------");
            System.out.print(covidCases[i][totalRecoveredCases]);
            System.out.println();
            System.out.println();
         }
         break;
         case 4:
         System.out.println("Active Cases ");
         System.out.println("------------------");
         for(int i=0;i<covidCases.length;i++){
            System.out.println(countrynames[i]);
            System.out.println("------------------");
            System.out.print(covidCases[i][activeCases]);
            System.out.println();
            System.out.println();
         }
        break ;
        default:
            System.out.println("Invalid choice");
      }
   }

}
