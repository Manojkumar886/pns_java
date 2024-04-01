package core_java.Constuctor;

public class DefaultConstructor {
    public void Sample() {
        System.out.println(" Sample Execution");
    }

    // Default constructor
    public DefaultConstructor() {
        System.out.println(" welcome to Constructor builder..!");
    }

    public static void main(String[] args) {
        // classname objname=new constructorname();

        // INITILIZE AN OBJECT
        DefaultConstructor obj = new DefaultConstructor();

        // obj.Sample();
    }

}
