package core_java.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Demo_Function {
    public static void main(String[] args) {
        // Function<String, Integer> f = (no) -> no.length();

        // System.out.println(f.apply("Manojkumar"));

        List<Integer> arr = Arrays.asList(78, 89, 78, 34, 56, 32, 345, 3456, 353, 243);

        // System.out.println(arr);

        // for (Integer arr1 : arr) {
        // System.out.println(arr1);
        // }

        arr.forEach(values -> System.out.println(values));

    }

}
