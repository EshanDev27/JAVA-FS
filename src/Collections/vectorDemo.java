package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class vectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(5);
        vector.add(15);
        vector.add(52);
        vector.add(54);
        vector.add(54);
        vector.add(54);
        vector.add(54);
        vector.addElement(40);
        vector.add(4);
        vector.add(54);
        vector.add(54);

        Enumeration<Integer> enu = vector.elements();
        while(enu.hasMoreElements()){
            System.out.println(enu.nextElement());
        }
//        System.out.println(vector.capacity());
//        vector.add(54);
//        System.out.println(vector.);
//        while(Enume)
    }
}
