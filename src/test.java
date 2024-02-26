class animal{
    animal(int i){
        System.out.println("animal" + i);
    }
}

class dog extends animal{
    dog(){
        super(1);
        System.out.println("bark");
    }
}

public class test {
    public static void main(String[] args) {

    }
}