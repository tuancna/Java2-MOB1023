package mob1023_lab06;

public class MyThread implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
    
}
