package Classes;


import java.util.Random;

public class Truck extends Vehicle {

    Random rand = new Random();

    // Ładowność w kg
    private float loadCapacity;

    public float getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(float loadCapacity) {
        this.loadCapacity = loadCapacity;
    }


    public Truck() {
        // Dla konstruktora ogólnego losujemy wartość średniego dystansu
        avgDistance=5000+rand.nextFloat(95000);
    }

    public Truck(float mass, float fuelUsage, float loadCapacity, String brand) {
        super(mass, fuelUsage, brand);
        this.loadCapacity=loadCapacity;
        // Tu robimy to samo losowanie może potem zmienimy hmm hmm
        avgDistance=5000+rand.nextFloat(95000);
    }

    public int calcLoadAmount(float singleLoadWeight) {
        return (int)(this.loadCapacity/singleLoadWeight);
    }

    @Override
    public float calcUsageCost() {
        return (float) (getAvgDistance()*this.getFuelUsage()-this.loadCapacity);
    }

    @Override
    public String toString() {
        if(this.getMass()>=1000) {
            this.setMass(getMass()/1000);
            return "This is a " + this.getMass() + "t " + this.getBrand() + " truck";
        } else return "This is a " + this.getMass() + "kg " + this.getBrand() + " truck";
    }
}
