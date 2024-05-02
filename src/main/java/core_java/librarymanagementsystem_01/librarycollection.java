package core_java.librarymanagementsystem_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class librarycollection implements book_implementation, student_implementation, Runnable {

    static Scanner scan = new Scanner(System.in);

    LinkedList<student> studentdetails = new LinkedList<>();

    HashSet<book> bookdetails = new HashSet<>();

    public librarycollection() {
        student student1 = new student("Manojkumar", 1001, "BCA");
        student student2 = new student("Praveen", 1002, "BSC CS");
        studentdetails.add(student1);
        studentdetails.add(student2);

        book book1 = new book(101, "Zealous", "Razak", 5, 5);
        book book2 = new book(102, "Livewire", "Markjack", 10, 10);

        bookdetails.add(book1);
        bookdetails.add(book2);
    }

    @Override
    synchronized public void run() {
        System.out.println("welcome to " + Thread.currentThread().getName());

        librarycollection library1 = new librarycollection();

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
        studentdetails.add(studentdetails1);
        System.out.println(studentdetails1.getStudent_name() + " has been added successfully");
    }

    @Override
    public void listall_studentdetails() {
        Iterator it = studentdetails.iterator();

        for (; it.hasNext();) {
            System.out.println(it.next());
        }
    }

    @Override
    public void deletebystudent_userspecifications() {
        System.out.println(" which field you want choose delete");
        System.out.println("1.studetname/n2.studentid/n3.studentdepartment");
        System.out.println(" please select any one using numeric number");
        int process = scan.nextInt();
        switch (process) {
            case 1:
                System.out.println(" please enter your studentname");
                String studentname = scan.next();

                for (int i = 0; i < studentdetails.size(); i++) {
                    if (studentdetails.get(i).getStudent_name().equals(studentname)) {
                        studentdetails.remove(i);
                        System.out.println(studentname + " has beem deleted ...!");
                        break;
                    }
                }

                break;
            case 2:
                // System.out.println(" please enter yourbook name");
                // String bookname = scan.next();
                // for (int i = 0; i < bookspace.length; i++) {
                // if (bookspace[i].getBook_name().equals(bookname)) {
                // bookspace[i] = null;
                // System.out.println(bookname + " has been deleted successfully");
                // return;
                // }
                // }
                break;
            case 3:
                // System.out.println(" please enter yourbook author name");
                // String bookauthor_name = scan.next();
                // for (int i = 0; i < bookspace.length; i++) {
                // if (bookspace[i].getBook_author().equals(bookauthor_name)) {
                // bookspace[i] = null;
                // System.out.println(bookauthor_name + " has been deleted successfully");
                // return;
                // }
                // }
                break;
            default:
                break;
        }
    }

    @Override
    public book addnew_book(book bookdetails1) {
        bookdetails.add(bookdetails1);
        System.out.println(bookdetails1.book_name + " has been added successfully");
        return bookdetails1;
    }

    @Override
    public int upgrade_bookquantity(String bookname) {
        // for(int i=0;i<bookdetails.size();i++)
        // {
        // if(bookdetails)

        // }

        return 0;
    }

    @Override
    public void search_bybookname(String book_name) {
    }

    @Override
    public void showall_bookdetails() {
        Iterator it = bookdetails.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Override
    public void deletebybook_userspecifications() {
    }

}
