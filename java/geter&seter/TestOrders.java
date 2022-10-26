import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Items item1= new Items();
        Items item2= new Items();
        

        item1.setName("latte");
        item1.setPrice(7.5);
        item2.setName("Captcheno");
        item2.setPrice(4.5);


        Order order1=new Order();
        Order order2=new Order();
        Order order3=new Order();
        Order order4=new Order();
        

        order1.setName("Ahmad");
        order2.setName("thabet");

        order1.addItems(item2);
        order2.addItems(item1);
        order2.addItems(item2);
       

        order2.setReady(false);

        
       
       
        

        // Application Simulations
        // Use this example code to test various orders' updates
        
        order1.display();
        System.out.println("\n\n");
        order2.display();
      
        System.out.printf("\nReady: %s\n\n", order2.getStatusMessage());


        System.out.println(order3.getName() +"\n"+order4.getName() );
}}
