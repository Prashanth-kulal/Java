class MultiThreading extends Thread{
    public void run(){
        System.out.println("Thread "+ Thread.currentThread().getId() +" is running");
    }
}
public class Multithreading1 {
    public static void main(String[] args){
        for(int i=0;i<8;i++){
        MultiThreading mt1=new MultiThreading();
        mt1.start();
        }
    }
    
}
