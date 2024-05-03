package core_java.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class fileobject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File location = new File("D:\\png\\objecctofmobile.txt");

        // location.createNewFile();

        // FileOutputStream fos = new FileOutputStream(location);

        // ObjectOutputStream oos = new ObjectOutputStream(fos);

        // mobiledetails mobilemodel1 = new mobiledetails("oneplus", "CE3 lite", 21000,
        // 8);

        // oos.writeObject(mobilemodel1);

        // oos.close();
        // fos.close();

        FileInputStream fis = new FileInputStream(location);

        ObjectInputStream ois = new ObjectInputStream(fis);

        mobiledetails m1 = (mobiledetails) ois.readObject();

        System.out.println(" mobile model :" + m1.mobile_model);
        System.out.println(" mobile brand :" + m1.mobile_brand);
        System.out.println(" mobile ram :" + m1.mobile_ram);
        System.out.println(" mobile price :" + m1.mobile_price);

        ois.close();
        fis.close();
    }
}

class mobiledetails implements Serializable {
    String mobile_brand;
    String mobile_model;
    double mobile_price;
    int mobile_ram;

    @Override
    public String toString() {
        return "mobiledetails [mobile_brand=" + mobile_brand + ", mobile_model=" + mobile_model + ", mobile_price="
                + mobile_price + ", mobile_ram=" + mobile_ram + "]";
    }

    public mobiledetails(String mobile_brand, String mobile_model, double mobile_price, int mobile_ram) {
        this.mobile_brand = mobile_brand;
        this.mobile_model = mobile_model;
        this.mobile_price = mobile_price;
        this.mobile_ram = mobile_ram;
    }

}
