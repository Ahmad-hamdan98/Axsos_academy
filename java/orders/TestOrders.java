import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Items item1= new Items();
        Items item2= new Items();
        Items item3= new Items();
        Items item4= new Items();
            // Order variables -- order1, order2 etc.
        item1.name="mocha";
        item2.name="latte";
        item3.name="drip coffee";
        item4.name="capuccino";

        item1.price=5.5;
        item2.price=4.5;
        item3.price=6.5;
        item4.price=2.5;

        Order order1=new Order();
        Order order2=new Order();
        Order order3=new Order();
        Order order4=new Order();

        order1.name="Cindhuri";
        order2.name="Jimmy";
        order3.name="Noah";
        order4.name="Sam";

        order2.items.add(item1);
        order2.total+=item1.price;
        String x3=order2.items.get(0).name;
        order2.ready=true;

        order3.items.add(item4);
        order3.total+=item4.price;
        String x=order3.items.get(0).name;
        order3.ready=true;

        order4.items.add(item2);
        order4.items.add(item2);
        order4.items.add(item2);
        for (int i=0;i<order4.items.size();i++){
        order4.total+=order4.items.get(i).price;
        }
        String x2=order4.items.get(0).name;
        order4.ready=true;

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Items Name : %s\n", x3);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Items Name : %s\n", x);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Items Name : %s\n", x2);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
