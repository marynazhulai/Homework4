package Task2;

public class BoxerFinal {
    public static void main(String[] args) {
        Boxer ourBoxer = new Boxer (1,1,3);
        Boxer anotherBoxer = new Boxer (1,2,1);
        System.out.println(ourBoxer.fight(anotherBoxer));

        Boxer anotherBoxer2 =new Boxer(3,0,5);
        System.out.println(ourBoxer.fight(anotherBoxer2));
    }
}
