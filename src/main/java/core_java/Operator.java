package core_java;

public class Operator {
    public static void main(String[] args) {
        // student 10th mark list;

        int tamil_mark = 94;
        int english_mark = 86;
        int maths_mark = 78;
        int science_mark = 98;
        int social_mark = 96;

        maths_mark += 20; // assignment operator -98
        System.out.println("10th mark : " + (tamil_mark + english_mark + maths_mark + science_mark + social_mark));

        maths_mark -= 8;

        System.out.println(maths_mark);

        System.out.println((maths_mark + 7 + 1) >= science_mark); // 98>=98
        System.out.println((maths_mark) != (science_mark - 8)); // 90==90

        int totalmark = 464;

        System.out.println((89 == 189) && (tamil_mark >= english_mark)); // false
        System.out.println((89 == 189) || (tamil_mark >= english_mark)); // true

        System.out.println(!('C' != 'C'));

        int x = 110;
        int y = 105;

        // bitwise AND
        System.out.println(x & y);// 104
        System.out.println(x | y);// 110
        System.out.println(x ^ y); // 120
        int z = 10;
        // 8 4 2 1
        // x=10 1 0 1 0
        // ~x 0 1 0 1 =5
        System.out.println("~z =" + ~z);
        System.out.println(++x);// 111

        System.out.println(x++); // x+1 =111

        System.out.println(x);

        int ab = 100;
        int ba = 5;

        System.out.println(ab >> ba); // a/2 ^b ---> 100 /32 ==3

        System.out.println(ab << ba); // a * 2 ^n --->100*32 =3200
    }
}
