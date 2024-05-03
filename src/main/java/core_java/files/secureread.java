package core_java.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class secureread {
    public static void main(String[] args) throws IOException {
        File location = new File("D:\\png\\securewrite.txt");

        FileInputStream fis = new FileInputStream(location);

        InflaterInputStream iis = new InflaterInputStream(fis);

        int size = fis.available();

        byte[] mycontent = new byte[size];

        iis.read(mycontent);

        String bytetoString = new String(mycontent);

        System.out.println(" secure file content are \n" + bytetoString);

        iis.close();
        fis.close();

    }
}
