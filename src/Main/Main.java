package Main;
import Classes.Fleet;
import Classes.Truck;
import Classes.Car;
import Classes.Vehicle;

import java.util.Scanner;

public class Main {

    public static boolean canTransport(Fleet vehFleet, float mass, int count) {
        float loadToTransport = mass*count;
        float possibleLoadCapacity=0;
        for(int i=0; i< vehFleet.getVehicleCount(); i++) {
            if(vehFleet.getVehicleArray()[i] instanceof Truck) {
                possibleLoadCapacity += ((Truck) vehFleet.getVehicleArray()[i]).getLoadCapacity();
            }
        }
        if(possibleLoadCapacity>=loadToTransport) return true; else return false;
    }

    public static void main(String[] args) {
    /*Vehicle t = new Truck(3500, 13, "Iveco");
        System.out.println(t);

        Fleet vehiclesFleet = new Fleet(3);
        vehiclesFleet.getVehicleArray()[0] = new Truck(12000, 8, 4500, "Iveco");
        vehiclesFleet.getVehicleArray()[1] = new Car(2000, 11, "Skoda");
        vehiclesFleet.getVehicleArray()[2] = new Car(800, 23, "Mazda");
        System.out.println(vehiclesFleet);

        System.out.println("Koszt utrzymania floty wynosi " + vehiclesFleet.fleetCost() + " zł.\n");

        float sum=0;
        for(int i=0; i<3; i++) {
            System.out.println("Koszt utrzymania pojazdu "+ vehiclesFleet.getVehicleArray()[i].getBrand() +" wynosi " +
                    + vehiclesFleet.getVehicleArray()[i].calcUsageCost() + " zł");
            sum+=vehiclesFleet.getVehicleArray()[i].calcUsageCost();
        }

        System.out.println("\nW sumie " + sum + " zł");*/

        Scanner scanner = new Scanner(System.in);


        Fleet userFleet = new Fleet(3);

        for(int i=0; i<3; i++) {

            System.out.print("Podaj typ pojazdu " + (i+1) + ": ");
            String type = scanner.nextLine();
            System.out.print("Podaj masę w kg pojazdu " + (i+1) + ": ");
            String attr1 = scanner.nextLine();
            System.out.print("Podaj zużycie paliwa w litrach na km pojazdu " + (i+1) + ": ");
            String attr2 = scanner.nextLine();
            System.out.print("Podaj markę pojazdu " + (i+1) + ": ");
            String attr3 = scanner.nextLine();


            if (type.equals("Truck")) {
                System.out.print("Podaj ładowność w kg pojazdu " + (i+1) + ": ");
                String attr4 = scanner.nextLine();
                userFleet.getVehicleArray()[i] = new Truck(Float.parseFloat(attr1), Float.parseFloat(attr2), Float.parseFloat(attr4), attr3);
            }
            else if (type.equals("Car")) userFleet.getVehicleArray()[i] = new Car(Float.parseFloat(attr1), Float.parseFloat(attr2), attr3);
            else userFleet.getVehicleArray()[i] = new Car(Float.parseFloat(attr1), Float.parseFloat(attr2), attr3);
        }

        System.out.println("\n"+userFleet);

        System.out.println("Koszt utrzymania floty wynosi " + userFleet.fleetCost() + " zł.\n");

        System.out.println("Można przetransportować? " + canTransport(userFleet, 100, 1000));
        System.out.println("Można przetransportować? " + canTransport(userFleet, 20, 500000));
        System.out.println("Można przetransportować? " + canTransport(userFleet, 4460, 200));



    }

}
