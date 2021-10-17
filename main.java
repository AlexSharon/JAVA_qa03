

public class main {
    //program entry point
    public static void main(String[] args) {

        long a = 30;
        long b = 7;

        long r = a + b;
        System.out.println(r);

        r = a - b;
        System.out.println(r);

        r = a * b;
        System.out.println(r);

        r = a / b;
        System.out.println(r);

        r = a % b;
        System.out.println(r);
        //comment



        if (a % 2 == 0) {
            System.out.println("variable a: " + a + " is even");
        } else if (a % 2 == 1) {
            System.out.println("variable a: " + a + " is even");
        } else {
            System.out.println("unexpected result:");
        }


        if (b % 2 == 0) {
            System.out.println("variable b: " + b + " is even");
        }
        else if (b % 2 == 1) {
            System.out.println("variable b: " + b + " is odd");
        }
        else {
            System.out.println("unexpected result:");
        }


        System.out.println("\uD83D\uDE00");
    }
}
