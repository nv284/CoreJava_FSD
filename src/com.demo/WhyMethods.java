public class WhyMethods {

   int getMax(int [] array){
       int max = array[0];
       for(int i = 1; i < array.length; i++){

          if(array[i]>max){
            max = array[i];
          }
       }

    return max;
   }


    public static void main(String[] args) {
        int [] prodcutPrices= {1200 , 2300, 3300, 1600 , 1900};
         int [] cricketerScores ={90 , 88, 45,67,12, 34,19,20,22,11};
         int [] covidCases ={45678 , 678999, 6788676, 812355,457767,898799,798865};

       WhyMethods m1 = new WhyMethods();
      System.out.println( "Max covid cases "+m1.getMax(covidCases));
      System.out.println(m1.getMax(prodcutPrices));
      System.out.println(m1.getMax(cricketerScores));






      /*    int max = prodcutPrices[0];
         for(int idx=1 ;idx <prodcutPrices.length ;idx++){
            if(prodcutPrices[idx] > max){
                max = prodcutPrices[idx];
         }
    }
    System.err.println("maximum in prodcut prices is : "+max);
    int max1 = cricketerScores[0];
    for(int idx=1 ;idx <cricketerScores.length ;idx++){
       if(cricketerScores[idx] > max1){
           max1 = cricketerScores[idx];
    }
}
System.err.println("maximum in scores is : "+max1);*/
}
}
