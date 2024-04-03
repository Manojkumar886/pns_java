package core_java.Constuctor;

public class democopy_constructor {

    String username;
    String password;

    public democopy_constructor(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String toString() {
        return "username:     " + username + "password:   " + password;
    }

    public democopy_constructor(democopy_constructor d) {
        System.out.println("copy constructor");
        System.out.println(d);
        this.username = d.username;
        this.password = d.password;
    }

    public static void main(String[] args) {
        democopy_constructor demo1 = new democopy_constructor("Maddy", "Something");

        democopy_constructor demo2 = new democopy_constructor(demo1);

        System.out.println(demo1.password);
        System.out.println(demo2.password);
    }

}
