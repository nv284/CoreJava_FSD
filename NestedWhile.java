package weekTwo;

public class NestedWhile {
    public static void main(String[] args) {
        int row =1;
        //outer loop for rows
        while(row<=10){

            int col = 1;

            //inner while loop for columns
            while(col <=10){
                int table = row *col;
                System.out.print( table + "\n");
                col++;
            }
            System.out.println();
            row++;
    }
}
}