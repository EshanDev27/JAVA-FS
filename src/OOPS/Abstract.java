package OOPS;

abstract class vehicle{
    abstract void engine(int cc);
}

public class Abstract extends vehicle{
    @Override
    void engine(int cc) {
        System.out.println("Capacity of the engine : " + cc);
    }

    public static void main(String[] args) {
//        vehicle v1 = new vehicle(); Cannot instantiate an abstract class

        vehicle v1 = new Abstract();
        v1.engine(350);
    }
}
