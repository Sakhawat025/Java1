import java.util.Scanner;

public class Fibnacci{
    public static void main(String args[]){
        int number,first=0,secoend=1,temp,sum=0;
        Scanner s=new Scanner(System.in);
        number =s.nextInt();
        System.out.println("Fibnacci Number: ");
        for(int i=0;i<=number;++i){
            temp=first+secoend;
            System.out.print(first +" ");
            sum+=first;
            first=secoend;
            secoend=temp;
        }
        System.out.println(sum);
    }
}