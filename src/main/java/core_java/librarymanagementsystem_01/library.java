package core_java.librarymanagementsystem_01;

import java.util.Scanner;

public class library implements book_implementation, student_implementation {

    book bookspace[] = new book[5];
    student studentspace[] = new student[5];
    static Scanner scan = new Scanner(System.in);
    static {
        System.out.println("--------------------WELCOME TO ZEALOUS LIBRARY MANAGEMENT SYSTEM--------------------");
    }

    @Override
    public student add_newstudent(student studentdetails) {
        return studentdetails;
    }

    @Override
    public void listall_studentdetails() {
    }

    @Override
    public void book_checkin() {
    }

    @Override
    public void book_checkout() {
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

        return 1;
    }

    @Override
    public void search_bybookname(String book_name) {
    }

    @Override
    public void showall_bookdetails() {
        for (book get : bookspace) {
            System.out.println(get);
        }
    }

    public static void main(String[] args) {

        library library1 = new library();

        do {
            System.out.println(
                    "1.add new book \n2.listall bookdetails \n3.search book \n4.update book quantity\n5.register student\n6.listall student details\n7.check in\n8.check out \n9.EXIT\n ");
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
                    book newbook = new book(serialno, bookname, bookauthor, bookquantity);
                    library1.addnew_book(newbook);
                    break;
                case 2:
                    library1.showall_bookdetails();
                    break;
                case 9:
                    return;
                default:
                    System.out.println(" please only assign numeric value 1 to 9");
            }
        } while (true);
    }

}