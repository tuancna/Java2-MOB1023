package mob1023_lab08;

import java.util.ArrayList;

public class Bai02 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        
        for(int i = 1; i <= 10; i++){
            list.add(i);
        }
        
        list.forEach((x) -> {
            System.out.println(x);
        });        
    }
    
}
