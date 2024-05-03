package core_java.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demofilewrite {
    public static void main(String[] args) throws IOException {
        File location = new File("D:\\png\\samplewrite.txt");

        // location.mkdir();

        // location.createNewFile();
        // System.out.println(location.getName() + " has been created successfully");

        FileOutputStream fos = new FileOutputStream(location);

        Scanner scan = new Scanner(System.in);

        System.out.println(" please enter your file content?");
        String content = scan.nextLine();

        fos.write(content.getBytes());

        fos.close();

    }

}
