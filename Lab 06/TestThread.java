package mob1023_lab06;

public class TestThread {

    public static void main(String[] args) {
        OddThread t1 = new OddThread();
        EvenThread t2 = new EvenThread();
        
        t1.start();
        try{
            t1.join();
        } catch(InterruptedException e){
            System.out.println(e);
        }
        
        t2.start();
    }
    
}
