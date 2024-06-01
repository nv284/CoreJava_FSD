package com.sim.demo3;
/*
 * **Components**:
1. **Functional Interface Definition**
2. **Bank Account Interface with Static and Default Methods**
3. **Bank Implementations**
4. **Main Class for Execution**
 * 
 * */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount  axisAccount = new AxisBankAccount(1000.00);
	//	 AxisBankAccount axisAccount = new AxisBankAccount(0);
		BankAccount hsbcAccount = new HSBCBankAccount(2000.00);
		BankAccount hdfcAccount = new HDFCBankAccount(1500.00);
        BankAccount kotakAccount = new KotakBankAccount(2500.00);
		
		
		//execute for deposit
		BankOperation depositOperation = (account, amount) -> {
            account.deposit(amount);
            account.showAccountDetails();
        };
        
    /*    void  execute (BankAccount account , double amount) {
        	account.withdraw(amount);
        	account.showAccountDetails();
        };*/

        //execute 
		BankOperation withDrawOperation = (account , amount )->{
			account.withdraw(amount);
			account.showAccountDetails();
		};
	// Perform operation on Axis Bank account 
		System.out.println("Axis Bank Operations ");
		depositOperation.execute(axisAccount, 20000.00);
		withDrawOperation.execute(axisAccount, 500.00);
		
		
		// Perform operations on HSBC Bank Account
        System.out.println("\nHSBC Bank Operations:");
        depositOperation.execute(hsbcAccount, 1000.00);
        withDrawOperation.execute(hsbcAccount, 500.00);
        
        
     // Perform operations on HDFC Bank Account
        System.out.println("\nHDFC Bank Operations:");
        depositOperation.execute(hdfcAccount, 750.00);
        withDrawOperation.execute(hdfcAccount, 300.00);

        // Perform operations on Kotak Bank Account
        System.out.println("\nKotak Bank Operations:");
        depositOperation.execute(kotakAccount, 1250.00);
        withDrawOperation.execute(kotakAccount, 1000.00);
	}

}
