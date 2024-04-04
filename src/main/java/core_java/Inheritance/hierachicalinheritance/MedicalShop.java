package core_java.Inheritance.hierachicalinheritance;

public class MedicalShop extends DMART {
    public void mdeiBusiness() {
        System.out.println(
                "A pharmacy (also called drugstore in American English or community pharmacy or chemist in Commonwealth English) is a retail shop which provides pharmaceutical drugs, among other products.");
    }

    public static void main(String[] args) {
        MedicalShop medi = new MedicalShop();
        medi.mdeiBusiness();
        medi.BusinessModel();
    }
}
