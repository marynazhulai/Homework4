package Task7;

public class Test {
    public int a;
    public static int b;
    public int c;
    public int d;

    { for (int i = 0; i <= 2; i++) {
        a = i;
        System.out.println(a);
    }
    }

    static {
        for (int i = 6; i <= 8; i++) {
            b = i;
            System.out.println(b);
        }
    }

     public Test (int c, int d) {
        this.c = c;
        this.d = d;
    }
}
