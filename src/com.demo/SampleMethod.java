public class SampleMethod {
    
    void m1 (int a , int b ){
     System.out.println("m1 method is calling"); 
     System.out.println(a); 
    System.out.println(b);
    }
     public static void m2(String s1 , double d ){
        System.out.println("m2 method is calling"); 
       System.out.println(s1);
       System.out.println(d); 
     }
    public static void main(String[] args) {
        SampleMethod s1 = new SampleMethod();
        s1.m1(100, 400);
        m2("Hello",15.5);
        SampleMethod.m2("Work", 23.4);
    }

}
