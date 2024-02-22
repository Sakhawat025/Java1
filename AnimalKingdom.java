public class AnimalKingdom {
    public static void main(String[] args) {
    Animal lion = new Animal();
    System.out.println("Name: " + lion.name);
    System.out.println("Type: " + lion.type);
    System.out.println();
    
    Animal snake = new Animal("Snake","Small animals", true);
    System.out.println("Name: " + snake.name);
    System.out.println("Type: " + snake.type);
    System.out.println("Venomous: " + snake.venomous);
    System.out.println();
    
    Animal whale = new Animal("Whale", "Mammal","Plankton");
    System.out.println("Name: " + whale.name);
    System.out.println("Type: " + whale.type);
    System.out.println("Food: " + whale.food);
    System.out.println();
    
    snake.eat();
    snake.bite();
    }
    }
