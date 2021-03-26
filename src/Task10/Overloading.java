package Task10;

public class Overloading {
    int a;
    int b;
    String c;
    double d;
    boolean e;

    public Overloading(int a, int b, String c, double d, boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }


    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double d) {
        System.out.println("It`s d");
        if (d >= 1.0) {
            return 11.0;
        } else {
            return 22.0;
        }
    }

    public void sum(String c) {
        System.out.println("My string is " + c);
    }

    public boolean sum(int n) {
        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }
}
