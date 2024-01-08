import java.util.Scanner;

public class Factorial {
    /*public static void Fact(int n){
        int fact=1;
        for(int i=n;i>=1;--i){
            fact=fact*i;
        }
        System.out.println(fact);
        return;
    }*/

    /*public static void Fact(int num){
        int fact=1;
        for(int i=2;i<=num;++i){
            fact*=i;
        }
        System.out.println(fact);
    }*/

    // Using Recursion.
    /*public static int Fact (int num){
        if(num==0){
            return 1;
        }
        return num*Fact(num-1);
    }*/

    //Single Line (Using the Ternary operator)
    public static int Fact(int num){
        return(num==0 || num==1)? 1 : num*Fact(num-1);
    }
    public static void main(String args[]){
        Scanner sc=new  Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        int F_ck =Fact(num);
        System.out.println(F_ck);
    }
}