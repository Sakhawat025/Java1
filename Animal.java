public class Animal {
    private int tiger;
    private int lion;

    public static void bite (){
        System.out.println("Tigers are territorial and usually solitary in nature");
    }
    public static void venowous(){
        System.out.println("Lions are highly territorial and occupy the same area for generations.");
    }
    public static void main(String agrs[]){
        Animal animalTiger=new Animal();
        Animal animalLion=new Animal();
        /*Animal.tiger="10";
        Animal.lion="20";*/

        animalTiger.bite();
        animalLion.venowous();

        animalTiger.tiger=10;
        animalLion.lion=20;

        System.out.println("Tiger number is "+animalTiger.tiger);
        System.out.println("Lion number is "+animalLion.lion);
    }
}
