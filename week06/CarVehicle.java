package week06;

public interface CarVehicle extends Vehicle {
    void setNumberOfDoors(int numberOfDoors);
    int getNumberOfDoors();
    void setFuelType(String fuelType);
    String getFuelType();
}
