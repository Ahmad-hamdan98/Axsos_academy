public class Test {
    public static void main(String[] args){

        BankAcount acount1= new BankAcount();
        BankAcount acount3= new BankAcount();
        BankAcount acount2= new BankAcount();
        BankAcount acount4= new BankAcount();
        System.out.println(BankAcount.counting());
        
        System.out.println("You added :"+acount1.addeposit("balance",5.5)+" to your acount");
        System.out.println("You Add :"+acount1.addeposit("balance",124.5)+" to your acount");
        System.out.println("You Add :"+acount1.addeposit("savingsBalance",78.5)+" to your acount");
        System.out.println("You Add :"+acount1.addeposit("savingsBalance",102.5)+" to your acount");
        System.out.println("You take :"+acount1.withdraw("balance",234.5));
        System.out.println("your amount of many"+acount1.totalAmount());
        







    }
}
