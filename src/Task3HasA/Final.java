package Task3HasA;

public class Final {
    public static void main(String[] args) {
        Wheels wh = new Wheels(4,"tets");
        Engine eng = new Engine(100);
        Car myCar= new Car ("Audi",5,1956,wh, eng);
        System.out.println(myCar.wheels.nameOfWheels);
        System.out.println(myCar.engine.power);

    }
}
