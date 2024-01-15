package OOPS;

class animal{
    public void sound(){
        System.out.println("Hello");
    }

    animal speed(){
        System.out.println("Please use a child class");
        return new animal();
    }
}

class dog extends animal{
    public void sound(){
        System.out.println("Bark");
    }
}

class cat extends animal{
    public void sound(){
        System.out.println("Meow");
    }
}

class horse extends animal{
    horse speed(){
        System.out.println("40mph");
        return new horse();
    }
}

public class overriding {
    public static void main(String[] args) {
        dog bruno = new dog();
        bruno.sound();

        animal snowy = new cat(); //Parent can hold child class
        snowy.sound();
    }
}