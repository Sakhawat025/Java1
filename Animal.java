public class Animal {
    String name;
    String type;
    boolean venomous;
    String food;
    // Default Constructor
    Animal(){
    this.name="Lion";
    this.type="Mammal";
    }
    // Parameterized Constructor
    Animal(String name,String type,boolean venomous){
    this.name=name;
    this.type=type;
    this.venomous=true;
    }
    
    //Copy Parameterized Constructor
    Animal(String name,String type,String food){
    this.name=name;
    this.type=type;
    this.food=food;
    }
    // eat methoad.
    void eat(){
    System.out.println(name+" is eating Plankton");
    }
    void bite(){
    System.out.println(name + " bites with venom!");
    }
    }