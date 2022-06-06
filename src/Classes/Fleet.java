package Classes;

import java.util.Arrays;

public class Fleet {
    private Vehicle[] vehicleArray;
    private int vehicleCount;

    public Fleet(int vehicleCount) {
        this.vehicleArray = new Vehicle[vehicleCount];
        this.vehicleCount = vehicleCount;

    }

    public Vehicle[] getVehicleArray() {
        return vehicleArray;
    }

    public void setVehicleArray(Vehicle[] vehicleArray) {
        this.vehicleArray = vehicleArray;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }

    public void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    public float fleetCost() {
        float cost=0;
        for(int i=0; i<this.vehicleCount; i++) {
            cost += vehicleArray[i].calcUsageCost();
        }
        return cost;
    }

    @Override
    public String toString() {
        String vehStr="Fleet contains " + vehicleCount + " vehicles : [";
        for(int i=0; i<this.vehicleCount; i++) {
            if(i>=(this.vehicleCount-1)) vehStr = vehStr + vehicleArray[i] + "]";
            else vehStr = vehStr + vehicleArray[i] + ", ";
            vehStr += "\n";
        }
        return vehStr;
    }
}
