package Task9;

import javax.swing.*;

public class Task9 {

    static int count;
    public Task9 (int count){
        this.count = count;
    }

    static void p(){
        count++;
        if (count >= 5 && count<=7) {
            System.out.println(">5");
            p();
        }
        else {
            System.out.println("<5");
        }

    }
    public static void main(String[] args) {
        Task9 t9 = new Task9(4);
        p();

    }

}
