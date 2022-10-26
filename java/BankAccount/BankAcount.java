
public class BankAcount{
   private double  Balance;
   private double savingsBalance;
   public static int numberOfPeople = 0;
   public static double AmountOfMany = 0;

   public BankAcount(){
    this.Balance=0.0;
    this.savingsBalance=0.0;
    numberOfPeople++;
    
   }

   public BankAcount(double  Balance,double savingsBalance){
    this.Balance=Balance;
    this.savingsBalance=savingsBalance;
    numberOfPeople++;
    AmountOfMany+=(Balance+savingsBalance);

   }
   public static int counting(){
    return numberOfPeople;
   }
   public double getbalance(){
    return Balance;
   }
   public double getsavingbalance(){
    return savingsBalance;
   }

   public double addeposit(String type ,double amount){
    if (type=="balance"){
        this.Balance=getbalance()+amount;
        return amount;
    }
    else if (type=="savingsBalance"){
        this.savingsBalance=getsavingbalance()+amount;
        return amount;
    }
    // System.out.println("wrong type \n please enter a right type .. ");

    return amount;

   }
   public double withdraw(String type ,double amount){
    if (type=="balance"){
        if(amount< this.Balance){
        this.Balance=getbalance()-amount;
        this.AmountOfMany-=amount;
        return amount;}
        else {
            System.out.println("this opration can't be done \n there are insufficient funds");
            return amount;
        }
    }
    else if (type=="savingsBalance"){
        if(amount> this.savingsBalance){
        this.savingsBalance=getsavingbalance()-amount;
        this.AmountOfMany-=amount;
        return amount;}
        else {System.out.println( "this opration can't be done \n there are insufficient funds ");
    }
    }
    // System.out.println("wrong type \n please enter a right type .. ");
  

        return amount;

    
    

   }
   public double totalAmount(){
    AmountOfMany+=(Balance+savingsBalance);
    return AmountOfMany;
   }
   

}