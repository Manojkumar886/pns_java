package core_java.ENcapsulation;

public class process {

    public static void main(String[] args) {
        EmployeeDetails emp = new EmployeeDetails();

        emp.setEmpid(1001);
        emp.setEmpexp(4);
        System.out.println(emp.empName);

        System.out.println(emp.getEmpid());
        System.out.println(emp.getEmpexp());
        System.out.println(emp.getEmpname());

    }

}
