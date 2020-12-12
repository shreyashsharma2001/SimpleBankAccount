package com.company;
import java.util.Scanner;
public class Main {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
	   //Bank class
        //Bank Account: Name ISBN ID Balance
        //Deposite Money : int money acknowledgement
        //Take money : int money acknowledgment
        // Show Balance : Remaining Money
        //Loan : int money, short intrest add in account
        //PayLoan : money ,  intreast ,time, deduct from bankAccount
        // Eligible for Loan : double YearSalary :30% of salary
        //time to payBack :

        BANK bank1=new BANK();
        int i,j,k,a;
        byte b;


        do {
            System.out.println("1 Check Bank Account Info");
            System.out.println("2 Check the Balance");
            System.out.println("3 Deposite Money in Account");
            System.out.println("4 Withdraw Money from Account");
            System.out.println("5 Take Loan");
            System.out.println("6 PayLoan");
            System.out.println("7 Exit from the system");

            i=s.nextInt();
            switch (i){
                case 1:bank1.BankAccount();
                break;
                case 2:bank1.showBalance();
                break;
                case 3:{
                    System.out.println("Enter the value of Money to be deposited");
                    j=s.nextInt();
                    bank1.DepositeMoney(j);
                }
                break;
                case 4:{
                    System.out.println("Enter the value of Money to be Withdraw");
                    k=s.nextInt();
                    bank1.withdrawMoney(k);
                }
                break;
                case 5: {

                    System.out.println("Enter the intreast ");
                    b=s.nextByte();
                    bank1.Loan(b);
                }
                break;
                case  6:bank1.PayLoan();

            }

        }while(i!=7);
    }
}
