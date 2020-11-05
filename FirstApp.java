package lessons.lessonone;

public class FirstApp {
    public static boolean method (int one,int two) {
        int sum = one + two;
        return sum >= 10 && sum <= 20;
    }
    public static float equation(int a,int b,int c,int d){
        return a * (b + (c* 1.0f / d));
    }
    private static String welcome(String name) {
        return "Привет, " + name + "!";
    }
    private static boolean number(int variable) {
        return variable >= 0;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        int c = 5;
        int d = 2;
        System.out.println("Answer " + equation(a,b,c,d));
        System.out.println("Range " + method(5, 12));
        System.out.println("Number is " + ((number(25)) ? "positive" : "negative") + "!");
        System.out.println(welcome("Nasty"));

    }
}

