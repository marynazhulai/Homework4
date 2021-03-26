
package Task8;
import java.util.Random;

    //В задании N7 пример того, в какой последовательности отрабатвает блоки инициализации и конструктор.
    //При создании первого объекта отработает сначала статический блок инициализации, потом динамический, потом конструктор.
    //При создании следующих объектов класса - статический блок инициализации уже не отрабатывает, а только динамический блок, потом конструктор

    //Ниже рассмотрим пример, когда полю присваиваем значение сразу: отработает сначала статический блок инициализации, потом инициализация поля,
    //потом динамический блок инициализации, потом конструктор.

    class Employee {

        private static int nextId;
        private int id;
        private String name = "Maryna";
        private double salary;

        // object initialization block
        {
            System.out.println("Inside initialization block");
            id = nextId;
            nextId++;
        }

        static {
            var generator = new Random();
            nextId = generator.nextInt(10000);
        }

        public Employee(String name, double salary) {
            System.out.println("Inside Employee(String, double) constructor");
            this.salary = salary;
            this.name = name;
        }

        public Employee() {
            System.out.println("Inside empty constructor");
            this.name = "";
            this.salary = 0.0;
        }

        public int getId() {
            return this.id;
        }
    }