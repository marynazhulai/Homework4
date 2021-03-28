package Task2;

public class BoxerFinal {
    public static void main(String[] args) {
        Boxer ourBoxer = new Boxer (3,3,3);
        Boxer anotherBoxer = new Boxer (5,6,19);
        System.out.println(ourBoxer.fight(anotherBoxer));
    }
}
