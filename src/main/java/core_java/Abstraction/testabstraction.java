package core_java.Abstraction;

public class testabstraction extends Demo_implementation {

    public void Executor() {
        // TODO Auto-generated method stub
        System.out.println(" throw new UnsupportedOperationException(\"Unimplemented method 'Executor'\");\r\n" + //
                "");
    }

    public static void main(String[] args) {
        Demo_implementation demo = new testabstraction();

        demo.Executor();
        int tl = demo.Teamleader();
        System.out.println(tl);

    }

}
