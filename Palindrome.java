import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
         int number,temp,first=0,rest;
        Scanner s=new Scanner(System.in);
        number =s.nextInt();
        temp=number;
        while (number!=0) {
            rest=number%10;
            first=first*10+rest;
            number=number/10;
        }
        if(temp==first){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
