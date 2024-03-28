public class Inventory {
    String name;
    String category;
    double price;
    int quantity;
    boolean availability;

    Inventory(String name,String category,double price,int quantity){
        this.name=name;
        this.category=category;
        this.price=price;
        this.quantity=quantity;
    }
    void sell(String name,int quantity){
        if(quantity!=quantity){
            System.out.println("Sorry,The product is out of stock");
        }else{
            quantity-=quantity;
        }
    }

    void restock(String name,int quantity){
        this.name=name;
        this.quantity=quantity;
    }

    void restockDisplay(){
        System.out.println("Name of Product: "+name+"Number Of Quantity: "+quantity);
    }
    void displayInventory(){
        System.out.println("Name: "+name+" "+"Category: "+category+" "+"Price: "+price+" "+"Quantity: "+quantity+" "+"Availability"+availability);
    }
   
}
