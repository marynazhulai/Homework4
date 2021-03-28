package Task4;

public class Calculator {
    private double firstValue;
    private double secondValue;
    private String operation;

    public Calculator()
    {
        System.out.println("This is empty method.Result is: ");
        this.firstValue=0;
        this.secondValue=0;
        this.operation="";
    }



    public Calculator(double firstValue, double secondValue, String operation) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation = operation;
    }



     public double calculate() {
         switch (operation) {
             case "+":
                 return firstValue + secondValue;
             case "-":
                 return firstValue - secondValue;
             case "*":
                 return firstValue * secondValue;
             case "/":
                 return secondValue != 0 ? firstValue / secondValue : 0;
             default:
                 return 0.0;
         }
    }
}
