package Constructor;

public class Cricket20 {

    Cricket20() {
        System.out.println("Constructor 1");
    }

    Cricket20(int a) {
        System.out.println("Constructor 2 : " + a);
    }

    Cricket20(String a) {
        System.out.println("Constructor 3 : " + a);
    }

    Cricket20(double a) {
        System.out.println("Constructor 4 : " + a);
    }

    Cricket20(char a) {
        System.out.println("Constructor 5 : " + a);
    }

    Cricket20(boolean a) {
        System.out.println("Constructor 6 : " + a);
    }

    Cricket20(long a) {
        System.out.println("Constructor 7 : " + a);
    }

    Cricket20(float a) {
        System.out.println("Constructor 8 : " + a);
    }

    Cricket20(int a, int b) {
        System.out.println("Constructor 9 : " + a + " " + b);
    }

    Cricket20(int a, String b) {
        System.out.println("Constructor 10 : " + a + " " + b);
    }

    Cricket20(String a, int b) {
        System.out.println("Constructor 11 : " + a + " " + b);
    }

    Cricket20(String a, String b) {
        System.out.println("Constructor 12 : " + a + " " + b);
    }

    Cricket20(int a, double b) {
        System.out.println("Constructor 13 : " + a + " " + b);
    }

    Cricket20(double a, int b) {
        System.out.println("Constructor 14 : " + a + " " + b);
    }

    Cricket20(int a, int b, int c) {
        System.out.println("Constructor 15 : " + a + " " + b + " " + c);
    }

    Cricket20(String a, String b, String c) {
        System.out.println("Constructor 16 : " + a + " " + b + " " + c);
    }

    Cricket20(int a, String b, int c) {
        System.out.println("Constructor 17 : " + a + " " + b + " " + c);
    }

    Cricket20(String a, int b, String c) {
        System.out.println("Constructor 18 : " + a + " " + b + " " + c);
    }

    Cricket20(int a, long b, String c) {
        System.out.println("Constructor 19 : " + a + " " + b + " " + c);
    }

    Cricket20(int a, String b, double c, boolean d) {
        System.out.println("Constructor 20 : " + a + " " + b + " " + c + " " + d);
    }

    public static void main(String[] args) {

        new Cricket20();
        new Cricket20(101);
        new Cricket20("India");
        new Cricket20(6.5);
        new Cricket20('C');
        new Cricket20(true);
        new Cricket20(123456789L);
        new Cricket20(45.5f);
        new Cricket20(100, 200);
        new Cricket20(101, "India");
        new Cricket20("Virat", 18);
        new Cricket20("India", "Australia");
        new Cricket20(150, 7.5);
        new Cricket20(8.2, 250);
        new Cricket20(100, 200, 300);
        new Cricket20("India", "Australia", "England");
        new Cricket20(18, "Virat", 120);
        new Cricket20("Rohit", 45, "Mumbai");
        new Cricket20(7, 123456789L, "Captain");
        new Cricket20(101, "India", 325.5, true);
    }
}