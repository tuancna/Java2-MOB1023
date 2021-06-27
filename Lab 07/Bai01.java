package mob1023_lab07;

public class Bai01 {

    public static void main(String[] args) {
        PolyStudent sv = new PolyStudent();
        sv.fullName = "Nguyễn Văn Tèo";
        sv.career = Career.valueOf("UDPM");
        
        sv.print();
    }
    
}
