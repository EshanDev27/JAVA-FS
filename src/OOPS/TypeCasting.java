package OOPS;

class parent{
    void display(){
        System.out.println("This is parent class");
    }
}

class child extends parent{
    void display(){
        System.out.println("This is child class");
    }
}

public class TypeCasting {
    public static void main(String[] args) {

        parent p = new parent();
        p.display();

        p = (parent) new child();  //parent son = new child(); Upcasting
        p.display();

        child c = (child) p; //Down casting
        c.display();

        //Implicit Typecasting : Widening
//        int num = 5;
//        System.out.println("number as an Integer : " + num);
//        double num2 = num;
//        System.out.println("number as double : "  + num2);
//
//        //Narrowing
//        float num3 = 5.3f;
//        System.out.println("Number as a float : " + num3);
//        int num4 = (int)num3;
//        System.out.println("Number as  an int : " + num4);
    }
}
