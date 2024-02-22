public class Math {
    int x,y,z;

    // methoad add()
    static int add(int x, int y){
        return x+y;
    } 

    //over loading methoad
    static int  add(int x,int y,int z){
        return x+y+z;
    }

    // methoad add()
    static  float add(float x, float y){
        return x+y;
    } 

    //over loading methoad
    static float add(float x,float y,float z){
        return x+y+z;
    }

    public static void main(String args[]){
        Math m=new Math();
        System.out.println(Math.add(3,4));
        System.out.println(Math.add(3,4,5));
        System.out.println(Math.add(3.5f,4.7f));
        System.out.println(Math.add(3.9f,4.5f,5.6f));
    }
}
