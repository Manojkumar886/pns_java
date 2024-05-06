package core_java.librarymanagementsystem_01;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class libraryfiles implements book_implementation, student_implementation, Runnable {
    static Scanner scan = new Scanner(System.in);

    HashSet<book> bookdetails = null;
    LinkedList<student> studentdetails = null;

    File location = new File("D:\\png\\libraryfile.doc");

    public void write() throws IOException {
        FileOutputStream fos = new FileOutputStream(location);

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(studentdetails);

        oos.close();
        fos.close();
    }

    public void read() {
        try {
            FileInputStream fis = new FileInputStream(location);
            ObjectInputStream ois = new ObjectInputStream(fis);

            studentdetails = (LinkedList<student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    // public libraryfiles() {
    // File location = new File("D:\\png\\libraryfile.doc");

    // try {
    // location.createNewFile();
    // LinkedList<student> studentdetails = new LinkedList<>();
    // FileOutputStream fos = new FileOutputStream(location);
    // ObjectOutputStream oos = new ObjectOutputStream(fos);

    // oos.writeObject(studentdetails);
    // oos.close();
    // fos.close();

    // } catch (IOException e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // }

    // }

    @Override
    synchronized public void run() {
        System.out.println("welcome to " + Thread.currentThread().getName());

        libraryfiles library1 = new libraryfiles();

        do {
            System.out.println(
                    "1.add new book \n2.listall bookdetails \n3.search book \n4.update book quantity\n5.register student\n6.listall student details\n7.delete book\n8.delete student \n9.EXIT\n ");
            System.out.println("please choose any one\n");
            int process = scan.nextInt();
            switch (process) {
                case 1:
                    System.out.println("you are choose add new book detail please enter\n");
                    System.out.println("enter serial no");
                    int serialno = scan.nextInt();
                    System.out.println("enter your book name");
                    String bookname = scan.next();
                    System.out.println("enter your book author");
                    String bookauthor = scan.next();
                    System.out.println(" enter total no of books");
                    int bookquantity = scan.nextInt();
                    int copybookqnt = bookquantity;

                    // para cons
                    book newbook = new book(serialno, bookname, bookauthor, bookquantity, copybookqnt);
                    library1.addnew_book(newbook);
                    break;
                case 2:
                    library1.showall_bookdetails();
                    break;
                case 3:
                    System.out.println(" which book you want search in my liabrary");
                    String searchbookname = scan.next();
                    library1.search_bybookname(searchbookname);
                    break;
                case 4:
                    System.out.println("update particular quantity based on book name!");
                    System.out.println(" please enter your bookname");
                    String updatebookname = scan.next();
                    library1.upgrade_bookquantity(updatebookname);
                    break;
                case 5:
                    System.out.println(" your  choose to new student details...please enter follow thw question!");
                    System.out.println("please enter your name");
                    String studentname = scan.next();
                    System.out.println("enter your id");
                    int studentid = scan.nextInt();
                    System.out.println("enter your department name");
                    String deptname = scan.next();
                    student newstudent = new student(studentname, studentid, deptname);
                    library1.add_newstudent(newstudent);
                    break;
                case 6:
                    library1.listall_studentdetails();
                    break;
                case 7:
                    library1.deletebybook_userspecifications();
                    break;
                case 8:
                    library1.deletebystudent_userspecifications();
                    break;
                case 9:
                    return;
                default:
                    System.out.println(" please only assign numeric value 1 to 9");
            }
        } while (true);

    }

    @Override
    public void add_newstudent(student studentdetails1) {

        try {
            read();
            studentdetails.add(studentdetails1);
            write();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public void listall_studentdetails() {
        read();
        Iterator it = studentdetails.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Override
    public void deletebystudent_userspecifications() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletebystudent_userspecifications'");
    }

    @Override
    public book addnew_book(book bookdetails) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addnew_book'");
    }

    @Override
    public int upgrade_bookquantity(String bookname) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'upgrade_bookquantity'");
    }

    @Override
    public void search_bybookname(String book_name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search_bybookname'");
    }

    @Override
    public void showall_bookdetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showall_bookdetails'");
    }

    @Override
    public void deletebybook_userspecifications() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletebybook_userspecifications'");
    }

}