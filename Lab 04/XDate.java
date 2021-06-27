package mob1023_lab04;

import java.text.ParseException;

public class XDate {
    private static final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/mm/yyyy");

    public boolean verifyInput(String input) {
        if(input != null) {
            try{
                java.util.Date ret = sdf.parse(input.trim());
                if (sdf.format(ret).equals(input.trim())) {
                    return true;
                }
            } catch (ParseException e) {
                    return false;
            }
        }
        return false;
    }
}
