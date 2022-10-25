import javax.sound.sampled.SourceDataLine;
import java.util.ArrayList;

public class CafeUtil{
    public int  getStreakGoal(){
        int sum=0;
        for(int i=0 ;i<11;i++){
            sum+=i;
        }
        return sum ;
    }
    public double getOrderTotal(double[] prices){
        double sums=0;
         for(double price:prices){
            sums+=price;
        }
        return sums;
    

    }
    public void displayMenu(ArrayList<String> menuItems){
        for (int i=0;i<menuItems.size();i++){

            System.out.println(i+ " "+ menuItems.get(i));
        }
    }
    
    public void addCustomer(ArrayList<String> arr){
    
        System.out.println("\nPlease Enter your name ...");
        String userName = System.console().readLine();
       
        arr.add(userName);
        System.out.println("\nHello "+userName+" trher is "+(arr.size()-1)+" "+" befor you..");
        System.out.println(arr);


    }
}