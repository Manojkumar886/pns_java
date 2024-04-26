package core_java.Collection.LinkedList;

import java.util.LinkedList;

public class Demo_Linked {
    public static void main(String[] args) {
        LinkedList Link = new LinkedList(); // generic

        Link.add("Manojkumar");
        Link.add(9789355930l);
        Link.add(78);
        Link.addFirst("ZealousTechCorp");
        Link.add('M');
        Link.add(78);

        System.out.println(Link);

        Link.removeFirst();
        Link.remove(3);
        System.out.println(Link);
        System.out.println(Link.get(0));

        Link.set(0, "Annamalai");

        Link.clear();
        System.out.println(Link);

    }
}
