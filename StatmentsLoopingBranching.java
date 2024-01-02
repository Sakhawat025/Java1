public class StatmentsLoopingBranching {
    public static void main(String args[]){
        int x=3;
        String name="Dirk";
        x=x*17;
        System.out.println("x is "+x);
        double d= Math.random();
        while(x>12){
            x=x-1;
        }

        for(x =0;x>10;x=x+1){
            System.out.print("X is now \n"+x);
        }
        if(x==10){
            System.out.print("X must be 10\n");
        }else{
            System.out.println("x isn't 10");
        }
        if ((x<3) & (name.equals("Dirk"))){
            System.out.println("Gently");
        }
        System.out.println("This line runs no matter what");
    }
}
