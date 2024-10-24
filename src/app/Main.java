    package app;

    public class Main {
        public static void main(String[] args) {

            Employee employee = new Employee("Іван Петров", "Менеджер", "ivan.petrov@example.com", "+380123456789", 35);
            employee.printEmployeeInfo();

            Car car = new Car();
            car.start();
        }
    }

