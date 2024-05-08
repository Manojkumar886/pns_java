package core_java.methodreference;

import java.util.Comparator;

public class demostaticmethodreference {
    public static void main(String[] args) {
        // contract c= (a,b)->{ System.out.println(a+b);};
        // c.multiple(56,78);

        contract.multiple(456, 44);

        // int compare = demostaticmethodreference.comparenumbers(78, 67);
        // System.out.println(" normal static usage :" + compare);

        // Comparator<Integer> compare1 = (x, y) -> {
        // return Integer.compare(89, 23);
        // };

        // System.out.println(" lambeda with comapre :" + compare1.compare(78, 65));

        // // contract ca = (x, y) -> {
        // // return x + y;
        // // };

        // System.out.println(ca.add(89, 89));

        // static method reference
        // Comparator<Integer> comapre2 = demostaticmethodreference::comparenumbers;
        // System.out.println("static method reference :" + comapre2.compare(89, 23));
        // instance method reference
        // demostaticmethodreference obj = new demostaticmethodreference();
        // contract c = obj::comparenumbers1;
        // System.out.println(c.add(4, 6));

        // constractor reference

        // contract c = demostaticmethodreference::new;
        // c.add(34, 34);

    }

    public static int comparenumbers(int x, int y) {
        return Integer.compare(x, y);// x>y=1 ,x<y=-1,x==y=0
    }

    public int comparenumbers1(int a, int b) {
        return a * b;
    }

    demostaticmethodreference(int a, int b) {
        System.out.println("a value" + a + "\n b value is " + b);
    }
}

// @FunctionalInterface
// public interface Comparator<T>
// {

// public int compare(int x,int y);
// }