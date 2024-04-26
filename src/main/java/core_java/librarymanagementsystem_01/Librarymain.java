package core_java.librarymanagementsystem_01;

public class Librarymain {
    public static void main(String[] args) {
        library lib1 = new library();

        Thread th1 = new Thread(lib1, "Manojkumar");
        th1.start();

        Thread th2 = new Thread(lib1, "Annamalai");
        th2.start();

        Thread th3 = new Thread(lib1, "Rolex");
        th3.start();
    }

}
