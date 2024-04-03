package core_java.Constuctor;

public class DemoArguments {

    String collegename = "MCE";
    double CGPA;
    static int age;

    // parameterized constructor
    public DemoArguments(String collegename, double CGPA, int myage) {
        System.out.println(CGPA);
        this.CGPA = CGPA;
        age = myage;
    }

    // default constructor
    public DemoArguments() {
        System.out.println("Sample");
    }

    public static void main(String[] args) {
        DemoArguments obj1 = new DemoArguments();
        DemoArguments obj = new DemoArguments(obj1.collegename, 8.9, 23);
        System.out.println("----- MY PERSONAL DETAILS ----");
        System.out.println(" MY COLLEGENAME  :" + obj.collegename);
        System.out.println("MY CGPA :" + obj.CGPA);
        System.out.println("MY AGE :" + age);

    }

}
