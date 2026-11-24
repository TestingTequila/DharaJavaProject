package Day2;

public class MathOperations {
    static void main() {

        System.out.println("Rule 1: I/I = always pick the integer part");
        System.out.println(10 / 2); // 5
        System.out.println(15 / 5); // 3
        System.out.println(9 / 2);  // 4

        System.out.println("Rule 2: I/D or D/I or D/D = pick integer+Decimal part");
        System.out.println(10.0 / 2); // 5.0
        System.out.println(15.0 / 5); // 3.0
        System.out.println(9 / 2.0);  // 4.5
        System.out.println(9.0 / 2.5);  //3.6

        int a = 10;
        int b = 2;
        int c = 3;

        int div1 = a / c;
        System.out.println(div1);//3

        double div2 = a / c; //3.0
        System.out.println(div2);//3.0

        System.out.println("Modulo Operator % - Remainder");

        System.out.println(10 % 2);// 0
        System.out.println(9 % 2); //1
        System.out.println(9.2 % 2); //1.1999999999999993

    }
}
