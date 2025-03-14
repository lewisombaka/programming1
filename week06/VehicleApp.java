package week06;
import java.util.Scanner;

public class VehicleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a vehicle type (car/motorcycle/truck): ");
        String vehicleType = scanner.nextLine().toLowerCase();

        Vehicle vehicle = null;

        switch (vehicleType) {
            case "car":
                vehicle = createCar(scanner);
                break;
            case "motorcycle":
                vehicle = createMotorcycle(scanner);
                break;
            case "truck":
                vehicle = createTruck(scanner);
                break;
            default:
                System.out.println("Invalid vehicle type");
                System.exit(0);
        }

        if (vehicle != null) {
            displayVehicleDetails(vehicle);
        }

        scanner.close();
    }

    private static Car createCar(Scanner scanner) {
        System.out.println("Enter make: ");
        String make = scanner.nextLine();

        System.out.println("Enter model: ");
        String model = scanner.nextLine();

        System.out.println("Enter year: ");
        int year = Integer.parseInt(scanner.nextLine());

        Car car = new Car(make, model, year);

        System.out.println("Enter number of doors: ");
        int doors = Integer.parseInt(scanner.nextLine());
        car.setNumberOfDoors(doors);

        System.out.println("Enter fuel type (petrol/diesel/electric): ");
        String fuelType = scanner.nextLine();
        car.setFuelType(fuelType);

        return car;
    }

    private static Motorcycle createMotorcycle(Scanner scanner) {
        System.out.println("Enter make: ");
        String make = scanner.nextLine();

        System.out.println("Enter model: ");
        String model = scanner.nextLine();

        System.out.println("Enter year: ");
        int year = Integer.parseInt(scanner.nextLine());

        Motorcycle motorcycle = new Motorcycle(make, model, year);

        System.out.println("Enter number of wheels: ");
        int wheels = Integer.parseInt(scanner.nextLine());
        motorcycle.setNumberOfWheels(wheels);

        System.out.println("Enter motorcycle type (sport/cruiser/off-road): ");
        String type = scanner.nextLine();
        motorcycle.setMotorcycleType(type);

        return motorcycle;
    }

    private static Truck createTruck(Scanner scanner) {
        System.out.println("Enter make: ");
        String make = scanner.nextLine();

        System.out.println("Enter model: ");
        String model = scanner.nextLine();

        System.out.println("Enter year: ");
        int year = Integer.parseInt(scanner.nextLine());

        Truck truck = new Truck(make, model, year);

        System.out.println("Enter cargo capacity (in tons): ");
        double capacity = Double.parseDouble(scanner.nextLine());
        truck.setCargoCapacity(capacity);

        System.out.println("Enter transmission type (manual/automatic): ");
        String transmissionType = scanner.nextLine();
        truck.setTransmissionType(transmissionType);

        return truck;
    }

    private static void displayVehicleDetails(Vehicle vehicle) {
        System.out.println("\nVehicle Details:");
        System.out.println("Make: " + vehicle.getMake());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Year: " + vehicle.getYear());

        if (vehicle instanceof CarVehicle) {
            CarVehicle car = (CarVehicle) vehicle;
            System.out.println("Number of doors: " + car.getNumberOfDoors());
            System.out.println("Fuel type: " + car.getFuelType());
        } else if (vehicle instanceof MotorVehicle) {
            MotorVehicle motorcycle = (MotorVehicle) vehicle;
            System.out.println("Number of wheels: " + motorcycle.getNumberOfWheels());
            System.out.println("Motorcycle type: " + motorcycle.getMotorcycleType());
        } else if (vehicle instanceof TruckVehicle) {
            TruckVehicle truck = (TruckVehicle) vehicle;
            System.out.println("Cargo capacity (in tons): " + truck.getCargoCapacity());
            System.out.println("Transmission type: " + truck.getTransmissionType());
        }
    }
}
