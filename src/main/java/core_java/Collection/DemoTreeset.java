package core_java.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoTreeset {
    public static void main(String[] args) {
        TreeSet<studentdetails> zealousstudent = new TreeSet<>();

        studentdetails student1 = new studentdetails("Praveen", "Rasipuram", 22);
        studentdetails student2 = new studentdetails("Niranjana", "Namakkal", 21);
        studentdetails student3 = new studentdetails("Subash", "Salem", 25);

        zealousstudent.add(student3);
        zealousstudent.add(student2);
        zealousstudent.add(student1);

        Iterator it = zealousstudent.iterator();

        do {
            System.out.println(it.next());
        } while (it.hasNext());

    }
}

class studentdetails implements Comparable<studentdetails> {
    String student_name;
    String student_place;
    Integer student_age;

    @Override
    public String toString() {
        return "studentdetails [student_name=" + student_name + ", student_place=" + student_place + ", student_age="
                + student_age + "]";
    }

    public studentdetails(String student_name, String student_place, int student_age) {
        this.student_name = student_name;
        this.student_place = student_place;
        this.student_age = student_age;
    }

    @Override
    public int compareTo(studentdetails o) {
        // TODO Auto-generated method stub
        return this.student_age.compareTo(o.student_age);
    }

}