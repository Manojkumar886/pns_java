package core_java.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class DemoSets {
    public static void main(String[] args) {
        HashSet obj = new HashSet<>();

        obj.add("Manojkumar");
        obj.add(34);
        obj.add(89.9);
        obj.add(829387378387l);
        obj.add("Manojkumar");

        // System.out.println(obj);

        Iterator it = obj.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
