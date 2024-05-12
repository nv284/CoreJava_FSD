class  Operations{

    public static void main(String args []){
        int a = 5;
        System.out.println(a); // 5
        System.out.println(++a);// 6
        System.out.println(a++);//6 then it will 7 
        System.out.println(a);//7
        System.out.println(--a);//
        int x = 9 ; int y = 12 ; int z = 3;
        int exp1 = x-y / 3+z *2-1 ; //10
    
        System.out.println("Expression 1 "+ exp1);
        int exp2 = (x-y)/3+((z*2)-1);//4
         System.out.println("Expression 2 "+ exp2);

         System.out.println(" Logical operator ..");
         int x1 = 1 ;int y1=2 ; int z1=5;
         System.out.println("x1: "+(!((x1+2)==(1+2))));
         System.out.println("y1" +(!(y1==z1)));
         System.out.println("z1>x1 "+(!(z1>x1)));

         if(!(x1==y1)&&((y1+5)>z1)&&(!((z1-3)==0)))
         {
            System.out.println("Hello");
         }

        System.out.println(" Ternary operator / conditional operator -> ?:");

        System.out.println(" check proper age to vote ");
        int age = 20;
        String str = " You are eligible to vote ";
        String str2 = " You are not eligible to vote";

        String eligible = (age>=18) ?str :str2 ;
        System.out.println(" result = "+eligible);
        int a1= 2; int b1=4;
        int c1 = ++a1<b1-- -1 ? a1:b1;
        int d1 = a1++/2 ==b1-- %3 ? a1:b1;
        System.out.println("c1 = "+c1);
        System.out.println("d1 = "+d1);

        System.out.println(" Operator precedence example ");
        int s = 5 ; int t=10 ; int u = 3;
        int c = s+t*u/10;
        int p = s+ --t - ++u;
        int q = ++s + ++t +5 / 1*2 ;
        System.out.println(c);
        System.out.println(p);
        System.out.println(q);

    }
}