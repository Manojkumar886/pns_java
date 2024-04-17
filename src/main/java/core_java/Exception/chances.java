package core_java.Exception;

import java.util.Scanner;

public class chances {
    static Scanner scan = new Scanner(System.in);

    public static void unlimited(String content) {
        try {
            System.out.println(" enter your starting index");
            int start = scan.nextInt();
            System.out.println(" enter your ending index");
            int end = scan.nextInt();
            System.out.println(" my values " + content.substring(start, end));

        } catch (StringIndexOutOfBoundsException siobe) {
            System.out.println(siobe);
            System.out.println(" starting index values is 0 ending index value is " + content.length()
                    + "\n please enter only in this between numbers ");
            unlimited(content);
        }
    }

    public static void limited(String content, int chances) {
        try {
            System.out.println(" enter your starting index");
            int start = scan.nextInt();
            System.out.println(" enter your ending index");
            int end = scan.nextInt();
            System.out.println(" my values " + content.substring(start, end));

        } catch (StringIndexOutOfBoundsException siobe) {
            System.out.println(siobe);
            System.out.println(" starting index values is 0 ending index value is " + content.length()
                    + "\n please enter only in this between numbers ");
            if (chances < 3) {
                chances++;
                limited(content, chances);
            } else {
                System.out.println(" max attempt is over...!");
            }
        }
    }

    public static void main(String[] args) {
        String mycontent = "tag in HTML is used to display the text for those browsers which does not support script tag or the browsers disable the script by the user. ";
        // unlimited(mycontent);

        limited(mycontent, 1);
    }

}
