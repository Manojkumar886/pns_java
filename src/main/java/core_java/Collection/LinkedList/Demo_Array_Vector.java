package core_java.Collection.LinkedList;

import java.util.ArrayList;
import java.util.Vector;

public class Demo_Array_Vector {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList<>();// generic

        obj.add("Manojkumar");
        obj.add(90);
        obj.add(828667356763l);
        obj.add(89.289f);
        obj.add("Annamalai");
        obj.add("Praveen");

        System.out.println("Array list values" + obj);

        Vector obj1 = new Vector<>();
        obj1.add("Praveen");
        obj1.add("Tamil");
        obj1.add("subash");
        obj1.add("niranjana");
        obj1.addAll(obj);
        obj1.add("Manojkumar");
        System.out.println("Vector values " + obj1);

        obj1.retainAll(obj);

        System.out.println(obj1);

    }

}
