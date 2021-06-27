package mob1023_lab07;

import java.util.Scanner;

public class Month {
    enum MONTHS{
        JAN,
        FEB,
        MAR,
        APR,
        MAY,
        JUN,
        JUL,
        AUG,
        SEP,
        OCT,
        NOV,
        DEC
    };

    public static void main(String[] args) {
        MONTHS m;
        Scanner sc = new Scanner(System.in);
        System.out.print("> Nhập tháng: ");
        m = MONTHS.valueOf(sc.nextLine().toUpperCase());
        if(dayOfMonth(m) != -1){
            System.out.println("Tháng " + m.toString() + " có " + dayOfMonth(m) + " ngày.");
        } else if(dayOfMonth(m) == 29){
            System.out.println("Tháng " + m.toString() + " có 28 hoặc 29 ngày.");
        } else{
            System.out.println("Tháng không hợp lệ!");
        }
    }
    
    public static int dayOfMonth(MONTHS m){
        switch(m){
            case JAN:
            case MAR:
            case MAY:
            case JUL:
            case AUG:
            case OCT:
            case DEC:
                return 31;
            case APR:
            case JUN:
            case SEP:
            case NOV:
                return 30;
            case FEB: return 29;
            default: return -1;
        }
    }
    
}
