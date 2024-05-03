package core_java.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class securewrite {
    public static void main(String[] args) throws IOException {
        File location = new File("D:\\png\\securewrite.txt");

        // location.createNewFile();

        FileOutputStream fos = new FileOutputStream(location);

        DeflaterOutputStream dos = new DeflaterOutputStream(fos);

        String content = "Java File Class. The File class is an abstract representation of file and directory pathname. A pathname can be either absolute or relative.";

        dos.write(content.getBytes());

        System.out.println(location.getName() + " has been written successfully");

        dos.close();
        fos.close();

    }

}
