package Task2;

public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        if (Boxer.this.weight > anotherBoxer.weight && Boxer.this.age > anotherBoxer.age && Boxer.this.strength > anotherBoxer.strength){
            System.out.println("Did our boxer win?");
            return true;
        }
        else
            System.out.println("Did our boxer win?");
        return false;

    }
}
