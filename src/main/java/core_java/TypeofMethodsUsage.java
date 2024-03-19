package core_java;

import java.util.Scanner;

public class TypeofMethodsUsage {
    // with returtype and w/o argu
    public void woArg() {
        int studentcount = 55;
        int toppercounts = 10;
        System.out.println(" my class strengthis :" + studentcount);
    }

    // w/o return and w/o argu
    public String setName() {
        String myname = "Manoj";

        return myname;

        // return "Manoj";
    }

    // withreturn type and with argu
    public void passingtwithvariable(float weight, long mycontactno) {
        double changetodouble = weight;
        System.out.println(" my wwight is :" + weight + " weight is converted to double :" + changetodouble);
        System.out.println("my contact no is :" + mycontactno);
    }

    // withoutreturn type adn with arguments
    public double returnkeywordwitharguments(char initial) {
        int chartoint = initial;

        double inttodouble = chartoint;
        return inttodouble;

    }

    public static void main(String[] args) {
        TypeofMethodsUsage obj1 = new TypeofMethodsUsage();
        obj1.woArg();

        String gettingname = obj1.setName();

        System.out.println(" setname method give to myname " + gettingname);

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your contact no");
        Long mymobileno = scan.nextLong();
        obj1.passingtwithvariable(62.5f, mymobileno);

        double getting = obj1.returnkeywordwitharguments('N');
        System.out.println(" my double value :" + getting);
    }
}
