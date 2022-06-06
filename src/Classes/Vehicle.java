package Classes;

import Interfaces.Calculable;

public abstract class Vehicle implements Calculable {

    // w kilometrach
    protected static float avgDistance = 48000;
    // w kilogramach
    private float mass;
    // litry na kilometr
    private float fuelUsagePerKm;
    private String brand;

    public Vehicle() {
        this.mass = 1;
        this.fuelUsagePerKm = 1;
        this.brand = "Brand";
    }

    public Vehicle(float mass, float fuelUsagePerKm, String brand) {
        this.mass = mass;
        this.fuelUsagePerKm = fuelUsagePerKm;
        this.brand = brand;
    }

    public static float getAvgDistance() {
        return avgDistance;
    }

    public static void setAvgDistance(float avgDistance) {
        Vehicle.avgDistance = avgDistance;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public float getFuelUsage() {
        return fuelUsagePerKm;
    }

    public void setFuelUsage(float fuelUsagePerKm) {
        this.fuelUsagePerKm = fuelUsagePerKm;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float calcFuelCost(float distance) {
        return this.fuelUsagePerKm*distance;
    }

}
