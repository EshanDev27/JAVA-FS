package OOPS;

class addition{
    int sum(int... x){
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }
}

public class MagicFunc {
    public static void main(String[] args) {
//        System.out.println(sum(10));
       addition a1 = new addition();
        System.out.println(a1.sum(10));
        System.out.println(a1.sum(10,10));
        System.out.println(a1.sum(10,10,10));
    }
}