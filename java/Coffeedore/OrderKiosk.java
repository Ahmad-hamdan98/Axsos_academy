import java.util.ArrayList;
public class OrderKiosk{
    private ArrayList<Items> items=new ArrayList<Items>();

public void newOrder() {
        
    // Shows the user a message prompt and then sets their input to a variable, name
    System.out.println("Please enter customer name for new order:");
    String name = System.console().readLine();

    // Your code:
    // Create a new order with the given input string
    Order order5=new Order(name);
    System.out.println(" 0 banana -- $2.00 \n"+" 1 coffee -- $1.50 \n"+" 2 latte -- $4.50 \n"+" 3 capuccino -- $3.00 \n"+" 4 muffin -- $4.00");
    // Show the user the menu, so they can choose items to add.
    
    // Prompts the user to enter an item number
    System.out.println("Please "+order5.getName()+" enter a menu item index or q to quit:");
    String itemNumber = System.console().readLine();
    Items item1= new Items();
    item1.setName("banana");
        item1.setPrice(2.00);
        
    Items item2= new Items();
    item2.setName("Caffee");
    item2.setPrice(1.5);
    Items item3= new Items();
    item3.setName("latte");
    item3.setPrice(4.5);
    Items item4= new Items();
    item4.setName("copttino");
    item4.setPrice(3.00);
    Items item5= new Items();
    item5.setName("muffin");
    item5.setPrice(4.00);
    double tot=0.0;
    // Write a while loop to collect all user's order items
    while(!itemNumber.equals("q")) {
        if(Integer.parseInt(itemNumber)==0 ){
            items.add(item1);
            // order5.getOrderTotal();
            tot+=item1.getPrice();
        }
        else if(Integer.parseInt(itemNumber)==1 ){
            items.add(item2);
            // order5.getOrderTotal();
            tot+=item2.getPrice();
        }
        else if(Integer.parseInt(itemNumber)==2 ){
            items.add(item3);
            // order5.getOrderTotal();
            tot+=item3.getPrice();
        }
        else if(Integer.parseInt(itemNumber)==3 ){
            items.add(item4);
            // order5.getOrderTotal();
            tot+=item4.getPrice();
        }
        else if(Integer.parseInt(itemNumber)==4 ){
            items.add(item5);
            // order5.getOrderTotal();
            tot+=item5.getPrice();
        }
        else {System.out.println("wronge input >> try again");}
        System.out.println("Yor Total amount for now is :"+tot);
        System.out.println("Please enter a menu item index or q to quit:");
         itemNumber = System.console().readLine();
         
        // Get the item object from the menu, and add the item to the order
        // Ask them to enter a new item index or q again, and take their input
    }
    System.out.println("You have ordered :");
    for(int i=0;i<items.size();i++){
        System.out.println(i+" "+items.get(i).getName()+" $"+items.get(i).getPrice());
    }
    System.out.println("Your Total amount for now is :"+tot);
    // After you have collected their order, print the order details 
    // as the example below. You may use the order's display method.
    
}}
