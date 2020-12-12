package com.company;
import java.util.Scanner;
public class BANK {
   private double totalMoney=2018220;
  final private String ISBN="BD1212JANC43";
  final private String NameOfBank="SBI";
  final private int AccountNumber=22;
   private double YearSalary=213444;
  long money;
  byte intreast;
public static Scanner s=new Scanner(System.in);
   public void BankAccount(){
       System.out.println("Name of the Bank :"+NameOfBank);
       System.out.println("ISBN of the Bank :"+ISBN);
       System.out.println("Id of the customer :"+AccountNumber);
   }

   public void showBalance(){
       System.out.println("Your Total Balance :"+totalMoney);
   }

   public void DepositeMoney(int a){
       totalMoney=totalMoney+a;
       System.out.println("Money deposited :"+a);
   }

   public void withdrawMoney(int b){
       totalMoney=totalMoney-b;
       System.out.println("Money withdrawed :"+b);
   }
    int timeInMonths;
   boolean c;
   public boolean isElligible(long loan){
       System.out.println("Your Yearly salary is "+YearSalary);
       System.out.println("Enter time period for the loan in months");
       timeInMonths=s.nextInt();
       if(YearSalary*30/100*timeInMonths/12>loan){
           System.out.println("Congratulations you are elligible to take loan");
           c=true;
           return true;
       }else{
           System.out.println("Sorry but you are not elligible to take loan");
c=false;
           return false;
       }
   }

    boolean k;
   long Money;
   public void Loan(byte intreast1){
       System.out.println("Enter the amount of loan you want ");
       Money=s.nextLong();

if(isElligible(Money)){
    money=Money;
    intreast=intreast1;
    totalMoney=totalMoney+Money;
    System.out.println("Loan taken :"+money+" with "+intreast+"%"+" intreast per year for "+timeInMonths+" years");

}else{
    System.out.println("Loan Cancled ");
}

   }

   public void PayLoan(){
 if(c) {
     long n = money;
     double a = money * 12 / 100 * timeInMonths / 12;


     System.out.println("Your payback :" + (n + a));
     totalMoney = totalMoney - (n + a);

 }else{
     System.out.println("You have'ent took any loan");
 }

   }
}
