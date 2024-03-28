package core_java.Looping;

public class Demowhile_dowhile {
    public static void main(String[] args) {
        int i = 10;

        while (i <= 1) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i--;
        }

        int fav_number = 6;

        do {
            System.out.println(" this is even number");
            fav_number -= 10;
        } while (fav_number >= 10);

    }
}