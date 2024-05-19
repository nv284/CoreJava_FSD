class Mydata {

    void print(){
        System.out.println(" Print the method data ");
    }
    String sayhello(){
        return " Hello ";
    }
    public void display(){
        System.out.println("Method 1 ");
    }

    public int addition(){
        int x = 20 ; int y= 30;
        int z = x+y;
        return z;

    }
    public static void main(String[] args) {
        Mydata A = new Mydata();
        Mydata B = new Mydata();
        A.display();
        System.out.println("Addition is : "+ B.addition());
        A.print();
        System.out.println(B.sayhello());

    }
}
