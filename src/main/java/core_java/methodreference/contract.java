package core_java.methodreference;

@FunctionalInterface
public interface contract {

    public void add(int a, int b);

    public static void multiple(int a, int b) {
        System.out.println(a + b);
    }

}
