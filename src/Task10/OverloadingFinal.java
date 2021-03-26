package Task10;

import java.io.OutputStreamWriter;

public class OverloadingFinal {
    public static void main(String[] args) {
        Overloading over = new Overloading(1, 2, "g", 1.1, true);
        int f = over.sum(2, 2);
        System.out.println(f);

        double g = over.sum(1.0);
        System.out.println(g);

        over.sum("Marina");

        boolean j = over.sum(2);
        System.out.println(j);

        }
    }

