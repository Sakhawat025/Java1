public class TypeCast {
    public static void main(String args[]){
        int myID=77;
        float myID_Dicamal=myID;
        /*Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double */
        System.out.println("Widening casting(Automitically).");
        System.out.println(myID);
        System.out.println(myID_Dicamal);
        /*Narrowing casting must be done manually by placing the type in parentheses in front of the value: */
        double mY_ID=77.01;
        int mY_ID_Int=(int)mY_ID;
        System.out.println("Narrowing Casting.");
        System.out.println(mY_ID);
        System.out.println(mY_ID_Int);
    }
}
