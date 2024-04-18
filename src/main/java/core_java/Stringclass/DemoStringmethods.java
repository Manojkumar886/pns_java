package core_java.Stringclass;

public class DemoStringmethods {
    public static void main(String[] args) {
        // literal
        String employeename = "Manojkumar";

        char[] emp_desc = { 'J', 'A', 'V', 'A' };
        // NON-liternal
        String employee_position = new String(emp_desc);

        System.out.println(employee_position); // JAVA

        String emppos = "DEVELOPER";

        // concat()

        // System.out.println(employee_position.concat(emppos)); // JAVADEVELOPER

        employee_position.concat(emppos); // JAVADEVLOPER

        System.out.println(employee_position); // JAVA

        // charAt()

        System.out.println(employeename.charAt(7));// m

        // equals and equalignorecase

        System.out.println("Manojkumar".equals(employeename)); // true

        // compareTo() and compareIoIgnore()

        System.out.println("Manojkumar".compareTo(employeename)); // 0

        System.out.println("manojkumar".compareTo(employeename)); // 98 -66 =32

        // substring()

        System.out.println(emppos.substring(5)); // oper
        System.out.println(emppos.substring(5, 7)); // op

        // toUppercase(),toLowercase()

        System.out.println(emppos.toLowerCase());

        // replace()

        String mycontent = "String is basicallly an object that represents sequnace of character values";

        mycontent = mycontent.replace("i", "a");

        System.out.println(mycontent);

        // contains()

        System.out.println(mycontent.contains("St"));// false

        // emdsWith.startsWith

        System.out.println(emppos.startsWith("DEV")); // true

        // trim()

        String myword = "      i am manojkumar       ";
        System.out.println(myword);
        System.out.println(myword.trim());

        // split()

        String usage = "An array of characters works same as string class.its is a immutable.They are two ways to create string object";

        String[] wordsplit = usage.split(" ");

        for (String w : wordsplit) {
            System.out.println(w);
        }

        // getbytes()

        byte[] ascivalues = employeename.getBytes();

        for (byte asci : ascivalues) {
            System.out.println(asci);
        }
    }
}
