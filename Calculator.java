import java.util.Scanner;

public class Calculator {
    int x,y; //Attribute
    float x1,y1; //Attribute

    // int Method add()
    static int add(int x,int y){
        return x+y;
    }
    // int Method sub()
    static int sub(int x,int y){// Method OverLoding
        return x-y;
    }
    // float Method add()
    static float add(float x,float y){ // Method OverLoding
        //float x1=x,y1=y;
        return x+y;
    }
    // float Method add()
    static float sub(float x,float y){ // Method OverLoding
        //float x1=x,y1=y;
        return x-y;
    }

    public static void main(String[] args) {
        // Creat a Object 
        Calculator c=new Calculator();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter two number: ");
        int x=s.nextInt();
        int y=s.nextInt();
        
        System.out.print("Print Addition: ");
        System.out.println(Calculator.add(x,y));
        System.out.print("Print Subtract: ");
        System.out.println(Calculator.sub(x, y));
        
        System.out.print("Enter two Float Number: ");
        float x1=s.nextFloat();
        float y1=s.nextFloat();
        System.out.print("Print Addition: ");
        System.out.println(Calculator.add(x1,y1));
        System.out.print("Print Subtract: ");
        System.out.println(Calculator.sub(x1, y1));
    }
}
