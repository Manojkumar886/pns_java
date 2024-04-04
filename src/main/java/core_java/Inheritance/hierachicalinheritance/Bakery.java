package core_java.Inheritance.hierachicalinheritance;

public class Bakery extends DMART

{
    public void Sweet() {
        System.out.println(
                "A bakery is an establishment that produces and sells flour-based baked goods made in an oven such as bread, cookies, cakes, doughnuts, bagels, pastries, and pies. Some retail bakeries are also categorized as cafés, serving coffee and tea to customers who wish to consume the baked goods on the premises.");
    }

    public static void main(String[] args) {
        Bakery b = new Bakery();
        b.Sweet();
        b.BusinessModel();
    }
}
