import java.util.ArrayList;

public class Order {

    // Items item1= new Items();
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Items> items=new ArrayList<Items>();


    public String getName(){
        return name;
    }
    public double getTotal(){
        return total;
    }
    public boolean getReady(){
        return ready;
    }
    public ArrayList<Items> getItems(){
        return items;
    }
// ________________________________________________________________
    public void setName(String nam){
        name=nam;
    }
    public void setTotal(double tot){
        total=tot;
    }
    public void setReady(Boolean bol){
    ready=bol;
    }
    public void addItems(Items It){
        items.add(It);
    }

        public Order(){
            this("Gest");
            
        }
        public Order(String name){
            this.name=name;
            
        }

        public String getStatusMessage(){
            if (ready){
                return "your order is redy";
            }
            else{
                return "your order needs time ";
            }
        }
        public void display(){
            System.out.println("Costumer name :"+name);
            for(int i=0;i<items.size();i++){
                System.out.println( "iteme name : "+items.get(i).getName()+" \n item price : "+items.get(i).getPrice());
            }
            System.out.println("Total :"+getOrderTotal());
        }
        public double getOrderTotal(){
            for(int i=0;i<items.size();i++){
                total+=items.get(i).getPrice();
            }
            return total;
        }
       
        
    
}
