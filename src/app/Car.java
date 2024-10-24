    package app;

    public class Car {

        public void start() {
            startElectricity();
            startCommand();
            startFuelSystem();
            System.out.println("Автомобіль запущено!");
        }

        private void startElectricity() {
            System.out.println("Електрика запущена.");
        }

        private void startCommand() {
            System.out.println("Команда запуску оброблена.");
        }

        private void startFuelSystem() {
            System.out.println("Паливна система запущена.");
        }
    }

