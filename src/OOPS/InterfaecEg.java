package OOPS;

interface ex1{
    int cc1 = 350; // Implicitly public, static, and final

    void printCC(int capacity);
}

interface ex2{
    int cc = 310;

    void print();
}

class mix implements ex1, ex2{
    public void printCC(int capacity){
        System.out.println(capacity);
    }

    public void print(){
        System.out.println(ex2.cc);
    }
}

public class InterfaecEg {
    public static void main(String[] args) {
        mix merge = new mix();
        merge.printCC(350);
        merge.print();
    }
}
