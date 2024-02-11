import java.util.Scanner;

public class ArrayCompare {
    public static void main(String args[]){
        int i,j,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[] arrayFrist=new int [n];
        int[] array2nd=new int [n];
        int[]array3rd=new int [n];
        for(i=0;i<n;++i){
            arrayFrist[i]=s.nextInt();
        }
        for(i=0;i<n;++i){
            array2nd[i]=s.nextInt();
        }
        for(i=0;i<n;++i){
                if(arrayFrist[i]>array2nd[i]){
                    array3rd[i]=arrayFrist[i];
                }else {
                    array3rd[i]=array2nd[i];
                }
        }
        for(i=0;i<n;++i){
            System.out.println(array3rd[i]+ " ");
        }
    }
    
}
