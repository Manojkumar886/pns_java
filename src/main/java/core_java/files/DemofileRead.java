package core_java.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemofileRead {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        File location = new File("D:\\png\\samplewrite.txt");

        FileInputStream fis = new FileInputStream(location);

        int filesize = fis.available();

        byte[] mycontent = new byte[filesize];

        fis.read(mycontent);

        String bytetostring = new String(mycontent);

        System.out.println(bytetostring);

        fis.close();

    }

}
