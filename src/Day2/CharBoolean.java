package Day2;

public class CharBoolean
{
    static void main() {
        System.out.println("==================================================");
        // char - 2 byte [16 bits], Range --> [a-z][A-Z][0-9][!@#$%^&*()_+]
        char c1 = 'a';
        char c11 = 'b';
        char c2 = '1';
        char c3 = 'Z';
        char c4 = '$';


        char gender = 'F';
        char status = 'Y';

        System.out.println(c1);//a
        System.out.println(c11);//b
        System.out.println(c1 + c11);//195
        System.out.println((int) c1);
        System.out.println((int) c11);
        System.out.println(c11 + c2);//98+49
        System.out.println(c11 + 1);//98+1
        System.out.println(c11 + '1');//98+49
        System.out.println((int) c11 + (int) c1);//195
        System.out.println((int) c11 + (int) 1);//98+1
        System.out.println((char) 97); //a

        // boolean ~1 bit/ true & false

        boolean isMarried = false;
        boolean willJoinMeeting = true;


        // dataType nameOfVariable;
        //int x;
        //x=44;
    }
}
