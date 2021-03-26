package Task3HasA;

    public class Car {
        String model;
        int numberOfDors;
        int productionDate;
        Wheels wheels;
        Engine engine;

        public Car(String model, int numberOfDors, int productionDate, Wheels wheel, Engine engine )
        {
            this.model=model;
            this.numberOfDors=numberOfDors;
            this.productionDate=productionDate;
            this.wheels=wheel;
            this.engine = engine;
        }
}





