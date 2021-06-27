package mob1023_lab06;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EvenThread extends Thread {
    @Override
    public void run(){
         for(int i = 0; i <= 10; i++){
            if(i % 2 == 0){
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(OddThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
