import java.util.Scanner;

public class Loop {
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        System.out.print("Einter a number: ");
        int num=n.nextInt();
        int i=0;
        // for loop
        /*System.out.println("For Loop.");
        for(i=0;i<num;++i){
            System.out.println(i);
        }*/
        // while loop
        /*System.out.println("While Loop.");
        while(i<num){
            System.out.println(i);
            ++i; // i=i+1;
        }*/
        // Do While loop.
        System.out.println("do while loop.");
        do{
            System.out.println(i);
            i=i+1;
        }while(i<num);
    }
    
}
