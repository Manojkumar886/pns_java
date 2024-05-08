package core_java.FunctionalInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

import core_java.Exception.chances;

public class Demo_Predicate {
    public static void main(String[] args) {

        // Predicate<Integer> p = age -> { return (age>=18); };

        // System.out.println(p.test(67));

        // Predicate<String> p = name -> {
        // return (name.length() >= 10);
        // };

        // System.out.println(p.test("Manoj"));

        // ArrayList obj = new ArrayList<>();

        // obj.add("Manoj");
        // obj.add(9789355930l);
        // obj.add(60);
        // obj.add(166.7f);05,
        // obj.add(true);
        // obj.add('M');

        // Predicate<Collection> p = obj1 -> obj1.size() > 0;

        // System.out.println(p.test(obj));

        int[] mynumbers = { 120, 110, 11, 07, 999, 788, 567, 490 };

        Predicate<Integer> p = no -> no % 2 != 0;
        Predicate<Integer> p1 = np -> np >= 200;

        // check(p.negate(), mynumbers);

        // check(p.and(p1), mynumbers);

        check(p.or(p1), mynumbers);

        // for (int i = 0; i < mynumbers.length; i++) {
        // if (p.test(mynumbers[i])) {
        // System.out.println(mynumbers[i]);
        // }
        // }

    }

    static void check(Predicate<Integer> pre, int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            if (pre.test(numbers[i])) {
                System.out.println(numbers[i]);
            }
        }
    }

}
