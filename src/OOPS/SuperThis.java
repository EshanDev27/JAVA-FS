package OOPS;

public class SuperThis {
    String city;
    public static void main(String[] args) {
        eshan me = new eshan();
        me.print();
    }
}

class eshan extends SuperThis{
    String city;
    void print(){
        super.city = "Faridabad";
        city = "Pune";
        eshan me = new eshan();
        System.out.println("Father City : " + super.city +", Son City : " + this.city);
    }
}
