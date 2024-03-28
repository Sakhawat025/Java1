public class User {
    public static void main(String[] args) {
        Inventory product=new Inventory("Barger", "Fast Food", 250, 0);
        Inventory product2=new Inventory("Fish", "Sea Food", 1000, 12);
        Inventory product3=new Inventory("chicken", "Bantam breeds.", 500, 18);

        product.sell("Barger",3);
        product2.sell("Fish",6);
        product3.sell("Chicken",12);

        product.restock("Fast Food", 3);
        product2.restock("Sea Food", 7);
        product3.restock("Chickan", 10);

        product.restockDisplay();
        product2.restockDisplay();
        product3.restockDisplay();

        product.displayInventory();
        product2.displayInventory();
        product3.displayInventory();

    }
}
