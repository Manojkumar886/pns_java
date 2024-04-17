package core_java.librarymanagementsystem_01;

import java.util.Arrays;
import java.util.Scanner;

public class library implements book_implementation, student_implementation {

    book bookspace[] = new book[5];
    student studentspace[] = new student[5];
    static Scanner scan = new Scanner(System.in);
    static {
        System.out.println("--------------------WELCOME TO ZEALOUS LIBRARY MANAGEMENT SYSTEM--------------------");
    }

    @Override
    public void add_newstudent(student studentdetails) {
        try {
            for (int i = 0; i < studentspace.length; i++) {
                if (studentspace[i] == null) {
                    studentspace[i] = studentdetails;
                    System.out.println(studentdetails.getStudent_name() + " has been registered..!");
                    return;
                }
                throw new LibraryException();
            }
        } catch (LibraryException le) {
            System.out.println(le);
            System.out.println("please any one value you delete you will add new value..!");
            System.out.println(" which value you want delete");
            deletebystudent_userspecifications();
            add_newstudent(studentdetails);
        }
    }

    @Override
    public void listall_studentdetails() {
        for (student student : studentspace) {
            System.out.println(student);
        }

    }

    @Override
    public void deletebystudent_userspecifications() {
    }

    @Override
    public book addnew_book(book bookdetails) {
        for (int i = 0; i < bookspace.length; i++) {
            if (bookspace[i] == null) {
                bookspace[i] = bookdetails;
                System.out.println(bookdetails.getBook_name() + " has been addedd successfully..!");
                break;
            } else {
                System.out.println(" add no more space...!");
            }
        }
        return bookdetails;
    }

    @Override
    public int upgrade_bookquantity(String bookname) {
        System.out.println("your bookdetail list :");
        for (int i = 0; i < bookspace.length; i++) {
            if (bookname.equalsIgnoreCase(bookspace[i].getBook_name())) {
                System.out.println((bookspace[i]));
                System.out.println(" please enter your new quantity count..!");
                int newquantitycount = scan.nextInt();

                bookspace[i].setBook_quantity(newquantitycount);
                System.out.println(bookspace[i].getBook_name() + " quantity updated successfully....!");
                showall_bookdetails();
                break;
            }
        }
        return 1;
    }

    @Override
    public void search_bybookname(String book_name) {
        for (int i = 0; i < bookspace.length; i++) {
            if (book_name.equals(bookspace[i].getBook_name())) {
                System.out.println(bookspace[i] + " \n  has been founded position @" + i);
                break;
            }
        }
    }

    @Override
    public void showall_bookdetails() {
        for (book get : bookspace) {
            System.out.println(get);
        }
    }

    @Override
    public void deletebybook_userspecifications() {
        System.out.println(" which field you want choose delete");
        System.out.println("1.serialno/n2.bookname/n3.bookauthor");
        System.out.println(" please select any one using numeric number");
        int process = scan.nextInt();
        switch (process) {
            case 1:
                System.out.println(" please enter your serial number");
                int serialno = scan.nextInt();
                for (int i = 0; i < bookspace.length; i++) {
                    if (bookspace[i].getBook_serialno() == serialno) {
                        bookspace[i] = null;
                        System.out.println(serialno + " has been deleted successfully");
                        break;
                    }
                }
                break;
            case 2:
                System.out.println(" please enter yourbook name");
                String bookname = scan.next();
                for (int i = 0; i < bookspace.length; i++) {
                    if (bookspace[i].getBook_name().equals(bookname)) {
                        bookspace[i] = null;
                        System.out.println(bookname + " has been deleted successfully");
                        return;
                    }
                }
                break;
            case 3:
                System.out.println(" please enter yourbook author name");
                String bookauthor_name = scan.next();
                for (int i = 0; i < bookspace.length; i++) {
                    if (bookspace[i].getBook_author().equals(bookauthor_name)) {
                        bookspace[i] = null;
                        System.out.println(bookauthor_name + " has been deleted successfully");
                        return;
                    }
                }
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {

        library library1 = new library();

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

                case 9:
                    return;
                default:
                    System.out.println(" please only assign numeric value 1 to 9");
            }
        } while (true);
    }

}