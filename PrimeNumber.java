import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
         int number,i;
        Scanner s=new Scanner(System.in);
        number =s.nextInt();
        for(i=2;i<=number;++i){
            if(number%i==0){
                break;
            }
        }
        if(i==number){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
}
