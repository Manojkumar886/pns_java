package core_java.OVERRIDING;

class access extends mybank {
    public static void main(String[] args) {
        // mybank bank1 = new mybank();
        // System.out.println(bank1.getrateofinterest()); // 0

        // icicibank bank2 = new icicibank();
        // System.out.println(bank2.getrateofinterest()); // 7

        // indianbank bank3 = new indianbank();
        // System.out.println(bank3.getrateofinterest()); // 2

        // upcasting

        mybank jo = new access();
        mybank bank1 = new icicibank();

        System.out.println(bank1.getrateofinterest());

        mybank bank2 = new indianbank();

        System.out.println(bank2.getrateofinterest());

        mybank banl3 = new mybank();

        System.out.println(banl3.getrateofinterest());// 0

    }

}
