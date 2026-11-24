package Day1;

public class Day1 {

    static void main() {
        // 10
        //1. dataType nameOfVariable = value;
        //byte [127  to -128] 1 byte = 8 bits
        byte b1 = -127;
        byte b2 = 127;

        //System.out.println(b1);

        //short [32767 to -32768] 2 byte = 16 bits
        short s1 = 32767;
        short s2 = -32768;

        //System.out.println(s2);

        // int [2147483647 to -2147483648] 4 byte = 32 bits
        int i1 = 2147483647;
        int i2 = -2147483648;

        // long [9223372036854775807 to -9223372036854775808] 8 byte = 64 bits

        long l1 = 9223372036854775807L;
        long l2 = -9223372036854775808L;

        // WAP to add two numbers [10, 12]
        byte x = 120;
        byte y = 119;
        int diff = x - y;

        System.out.println(diff);

        // 12.34;

        float f1 = 99.12345678987654321F; // 4 byte/ up to 5-6 decimal places
        double d1 = 99.12345678987654321; // 8 byte/ above 14-15 decimal places

        System.out.println(f1);
        System.out.println(d1);





    }
}
