package mob1023_lab07;

public class PolyStudent {
    public String fullName;
    public Career career;
    
    public void print(){
        System.out.println("> Full name: " + this.fullName);
        switch(this.career){
            case UDPM:
                System.out.println("> Career: Ứng dụng phần mềm");
                break;
            case TKTW:
                System.out.println("> Career: Thiết kế trang web");
                break;
            case TKDH:
                System.out.println("> Career: Thiết kế đồ họa");
                break;
            case LTDD:
                System.out.println("> Career: Lập trình di động");
                break;
        }
    }
}
