public class TwoDarray {
public static void main(String[] args) {
    int[][]x = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    for(int i=0 ; i<3 ;i++){
        for(int j=0 ; j<3 ;j++){
            System.out.print(x[i][j]);
    }
    System.out.println();
}

String []name ={"deep" , "Amit" , "lara"}; // row 
int [] [] marks = new int [3][3]; 
//deep
marks[0][0]=80;
marks[0][1]=70;
marks[0][2]=88;
//Amit
marks[1][0] = 99;
marks[1][1] = 98;
marks[1][2] = 100;

//lara
marks[2][0] = 87;
marks[2][1] = 99;
marks[2][2] = 93;
for(int i = 0; i < marks.length; i++)
    {
       int total = 0;	
       for(int j = 0; j < marks.length; j++)
       {
          total = total + marks[i][j]; 
       }
       for(int k = 0; k < name.length; k++)
       {
          System.out.println("Total marks obtained by student " +name[k]+": " +total);
          double perc = (double)total/3;
          System.out.println("Percentage: " +perc);
       }
    }

}
}
