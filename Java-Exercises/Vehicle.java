import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static class Car extends Vehicle {
        private double trunkSize;
        private List<Car> carList;

        public Car(String make, String model, int year, double trunkSize) {
            super(make, model, year);
            this.trunkSize = trunkSize;
            this.carList = new ArrayList<>();
        }

        public double getTrunkSize() {
            return trunkSize;
        }

        public void setTrunkSize(double trunkSize) {
            this.trunkSize = trunkSize;
        }

        public void addCar(Car car) {
            carList.add(car);
        }

        public void displayCarDetails() {
            super.displayDetails();
            System.out.println("Trunk size: " + trunkSize);
        }
    }

    public static class Truck extends Vehicle {
        private double payloadCapacity;
        private List<Truck> truckList;

        public Truck(String make, String model, int year, double payloadCapacity) {
            super(make, model, year);
            this.payloadCapacity = payloadCapacity;
            this.truckList = new ArrayList<>();
        }

        public double getPayloadCapacity() {
            return payloadCapacity;
        }

        public void setPayloadCapacity(double payloadCapacity) {
            this.payloadCapacity = payloadCapacity;
        }

        public void addTruck(Truck truck) {
            truckList.add(truck);
        }

        public void displayTruckDetails() {
            super.displayDetails();
            System.out.println("Payload capacity: " + payloadCapacity);
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Focus", 2004, 400);
        Truck truck1 = new Truck("Toyota", "Hilux", 1999, 4000);

        car1.displayCarDetails();
        truck1.displayTruckDetails();
    }
}