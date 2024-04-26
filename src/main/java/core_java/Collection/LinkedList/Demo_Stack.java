package core_java.Collection.LinkedList;

import java.util.Stack;

public class Demo_Stack

{
    public static void main(String[] args) {
        Stack<Integer> filo = new Stack<>();// non generic

        filo.push(67);
        filo.push(10);
        filo.push(10);
        filo.push(100);
        filo.push(110);

        System.out.println(filo);

        filo.pop();
        filo.pop();

        System.out.println(filo);

        System.out.println(filo.peek());

        System.out.println(filo.empty());

        System.out.println(filo.search(67));

        // filo.add(89);
        System.out.println(filo);

    }

}
