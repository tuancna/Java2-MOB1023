package mob1023_lab04;

public class luongException {
    private final double salary;
    
    public luongException(double salary){
        this.salary = salary;
    }
    
    public boolean check(){
        return !(this.salary < 5000000 || this.salary > 10000000);
    }
}
