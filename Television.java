public class Television {
    private int channel;
    private int voulume;
    public void changeChannel(int n){
        System.out.println("Channel "+n);

    }
    public void changeVolume(int n){
        System.out.println(n);
    }

    public static void main(String args[]){
        Television sony=new Television();
        Television walton=new Television();
        sony.changeChannel(10);
        walton.changeVolume(-2);
    }

    
}
