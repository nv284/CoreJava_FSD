// calculate interest or discount rate and loan calculator 


import java.util.Scanner;
 class Calculator {
    double capital;
    double interest;
    double duration;
    double inflation;
    double sumOfPayments=0;
    double newValue=0;
    double newCashValue=0;
    
    Calculator(double capital, double interest, double inflation, double duration){
        this.capital=capital;
        this.interest=interest;
        this.inflation=inflation;
        this.duration=duration;

    }
    void capitalIncrease() {
        double capital=this.capital;
        double inflation=this.inflation;
        double duration=this.duration;
        for(int i=0; i<duration;i++) {
            capital=capital*((100+inflation)/100);
            System.out.printf("%d year: %,.2f\n",i+1, capital);
        }
        this.newValue=capital;
        
    }
    
    void capitalDecrease() {
        double capital=this.sumOfPayments;
        double inflation=this.inflation;
        double duration=this.duration;
        for(int i=0; i<duration;i++) {
            capital=capital*((100-inflation)/100);
            System.out.printf("%d year: %,.2f\n",i+1, capital);
        }
        newCashValue=capital;
    
    }
    
    void creditPayments() {
        double capital=this.capital;
        double interest=this.interest/12;
        double duration=this.duration*12;
        double amountPaid=0;
        double monthlyPayment;
        double monthlyInterest;
        
        for(int i=0; i<duration;i++) {
            monthlyInterest=(capital*((100+interest)/100)-capital);
            capital=capital+monthlyInterest;
            if(i>duration-2) {
                monthlyPayment =(capital/(duration-i))+(monthlyInterest-(monthlyInterest/(duration/(i+1))));    //added this to avoid overpayment for last month    
            } else {
                monthlyPayment=(capital/(duration-i))+(monthlyInterest);
            }
            capital=capital-monthlyPayment;
            amountPaid=amountPaid+monthlyPayment;


            System.out.printf("monthly Interest: %,.2f\n",monthlyInterest);
            System.out.printf("monthly Payment: %,.2f\n",monthlyPayment);
            System.out.printf("%d month left capital: %,.2f\n",i+1, capital);
        }

        this.sumOfPayments=amountPaid;
    }
    
    void getInfo() {
        System.out.printf("Overall paid amount: %,.2f\n",this.sumOfPayments);
        System.out.printf("Overall paid interest: %,.2f\n",this.sumOfPayments-this.capital);
        System.out.printf("Property value increase: %,.2f\n",this.newValue-this.capital);
        System.out.printf("Property value after %.0f years %,.2f \n",this.duration, this.newValue);
        System.out.printf("Sum of Payments will be worhth: %,.2f in today`s money\n",this.newCashValue);
    }
    

    
}

public class InterestAndDiscount
 {
 public static double capital;
    public static double interest;
    public static double inflation;
    public static double duration;

    
    public static void main(String[] args) {
        
    System.out.println("Provide the data for calculations:");
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is the starting capital: ");
    capital = scanner.nextDouble();
    System.out.println("What is the rate of interest in %: ");
    interest = scanner.nextDouble();
    System.out.println("What is the inflation rate in %: ");
    inflation = scanner.nextDouble();
    System.out.println("How long is the duration in years: ");
    duration = scanner.nextDouble();
    Calculator calculator1 = new Calculator(capital, interest, inflation, duration);
    
    calculator1.creditPayments();
    calculator1.capitalIncrease();
    calculator1.capitalDecrease();
    calculator1.getInfo();

    
    scanner.close();
}
 }