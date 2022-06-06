package Classes;

import java.util.Random;

public class Car extends Vehicle {
    Random rand = new Random();

    public Car() {
        avgDistance=1000+rand.nextFloat(9000);
    }

    public Car(float mass, float fuelUsagePerKm, String brand) {
        super(mass, fuelUsagePerKm, brand);
        avgDistance=1000+rand.nextFloat(9000);
    }

    @Override
    public float calcUsageCost() {
        return getAvgDistance()*this.getFuelUsage();
    }

    @Override
    public String toString() {
        if(this.getMass()>=1000) {
            this.setMass(getMass()/1000);
            return "This is a " + this.getMass() + "t " + this.getBrand() + " car";
        } else return "This is a " + this.getMass() + "kg " + this.getBrand() + " car";
    }
}
