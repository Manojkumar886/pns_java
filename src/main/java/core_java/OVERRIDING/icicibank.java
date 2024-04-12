package core_java.OVERRIDING;

public class icicibank extends mybank {
    public int getrateofinterest() {
        return 7;
    }

    public static void main(String[] args) {
        icicibank obj = new icicibank();
        System.out.println(obj.getrateofinterest());//

        mybank obj1 = new icicibank();
        obj1.getrateofinterest();// 7
        mybank obj2 = new mybank();
        obj2.getrateofinterest();// 0

        mybank obj3 = new indianbank();

        System.out.println(obj3.getrateofinterest());// 2
    }

}
