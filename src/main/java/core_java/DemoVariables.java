package core_java;

public class DemoVariables {

    int employee_counts = 3; // global variable

    static String Employe2 = "Manojkumar";// static variable

    public static int mysecondmethod() {
        System.out.println(" this is static method..!");
        return 289;
    }

    public void myfirstmethod() {

        System.out.println(" this is global variable " + employee_counts); // this is global variable allow to user
                                                                           // defined method
        String Employee1 = "Annamalai"; // local variable
        System.out.println(" this is static variable access in method" + Employe2);
        System.out.println(" my company senior employee name is :" + Employee1);
    }

    public static void main(String[] args) {
        DemoVariables obj1 = new DemoVariables(); // object creation
        obj1.myfirstmethod();
        obj1.myfirstmethod();

        String Companyname = "Zealous"; // INSTANCE VARIABLE

        System.out.println(" my company name is :" + Companyname);

        obj1.myfirstmethod();

        // System.out.println(employee_counts);//this is global variable doenst allow in
        // main method but with using object...
        System.out.println(obj1.employee_counts);

        System.out.println(" this is static variable access in method" + Employe2);
        mysecondmethod();// this is static method so,we dont need any object
    }

    static {
        System.out.println(" Welcome to Zealous Tech Corporation");
    }

}