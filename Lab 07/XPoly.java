package mob1023_lab07;

import javax.swing.JOptionPane;

public class XPoly {
    @Deprecated
    public static boolean isCardNumber(String number){
        long cardNumber = 0, sumDigit = 0;
        
        try{
            cardNumber = Long.parseLong(number);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Số thẻ không hợp lệ!", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        while(cardNumber > 0){
            sumDigit += (cardNumber /= 10);
        }
        
        return (sumDigit % 2 == 0);
    }
}
