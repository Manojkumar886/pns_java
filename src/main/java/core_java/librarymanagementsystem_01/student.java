package core_java.librarymanagementsystem_01;

public class student {
    private String student_name;
    private int student_id;
    private String student_department;

    public student(String student_name, int student_id, String student_department) {
        this.student_name = student_name;
        this.student_id = student_id;
        this.student_department = student_department;
    }

    @Override
    public String toString() {
        return "student [student_name=" + student_name + ", student_id=" + student_id + ", student_department="
                + student_department + "]";
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_department() {
        return student_department;
    }

    public void setStudent_department(String student_department) {
        this.student_department = student_department;
    }

}
