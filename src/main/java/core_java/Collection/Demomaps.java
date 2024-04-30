package core_java.Collection;

import java.util.HashMap;
import java.util.Map;

public class Demomaps {
    public static void main(String[] args) {

        HashMap<String, Integer> object = new HashMap<>();

        object.put("Manoj", 22);
        object.put("Subash", 25);
        object.put("Niranchana", 21);
        object.put("Praveen", 21);

        // System.out.println(object);

        for (Map.Entry obj : object.entrySet()) {
            System.out.println("keyclass" + obj.getKey() + "\t value class :" + obj.getValue());
        }
    }

}
