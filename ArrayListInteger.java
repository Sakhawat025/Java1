import java.util.ArrayList;
import java.util.Collections;
public class UapCsc {
    public static void main(String[] args) {
        UapCsc u1=new UapCsc();
        // creating the ArrayList
        ArrayList<Integer> list=new ArrayList<Integer> ();
        //adding elements
        list.add(66);
        list.add(77);
        list.add(76);
        list.add(-250);
        //get method
        int x=list.get(3);
        System.out.println(x);
        // array element
        System.out.println(list);
        //size check
        System.out.println(list.size());
        //add at apecfied elemeknt/insert element
        list.add(3,5);
        System.out.println(list);
        //remove element
        list.remove(list);
        System.out.println(list);
        //sort element
        list.sort(null);
        System.out.println(list);
        // itr
        System.out.println("Loop through the ArrayList: ");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    
}
