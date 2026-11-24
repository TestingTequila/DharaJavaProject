package Day2;

public class StringConcatenation {

    static void main() {

        System.out.println("==========String Concatenation========");

        String name = "Dhara";
        String x = "Hello";
        String y = "World";
        int a = 100;
        int b = 200;

        System.out.println("The sum of a and b is = " + a + b);
        System.out.println("The sum of a and b is = " + (a + b));

        System.out.println(x);//Hello
        System.out.println(y);//World
        System.out.println(x + y);//HelloWorld
        System.out.println(a + b);// 300
        System.out.println(x + a);//Hello100
        System.out.println(a + b + x + y);//300HelloWorld
        System.out.println(x + y + a + b);//HelloWorld100200
        System.out.println(x + y + (a + b));//HelloWorld300
        System.out.println(a + b + x + y + a + b);//300HelloWorld100200


    }


}
