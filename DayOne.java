class DayOne{
    // non primitive data type 
    String name = "Simplilearn";
    public static void main(String args[]){
       // class object 
       DayOne d1 = new DayOne(); // d1 is non primitive data type i.e. object ref 
       System.out.println("Object ref "+d1);
       //calling instance variable by using ref variable d1 
       System.out.println(d1.name );
       int x = 9 ; int y = 12 ; int z = 3;
        int exp = x-y / 3+z *2-1 ;
    
        System.out.println("Expression 1 "+ exp);
        int exp2 = (x-y)/3+((z*2)-1);
       
         System.out.println("Expression 2 "+ exp2);
    }
}