package factory;

import factory.bikes.*;

public class Factory {

    public static Bike createBike(String bikeName) {

        Bike bike = null;

        if(bikeName.equalsIgnoreCase("DirtBike")) {
            bike = new Dirt();
        }
        else if(bikeName.equalsIgnoreCase("MountainBike")) {
            bike = new Mountain();
        }
        else if(bikeName.equalsIgnoreCase("RoadBike")) {
            bike = new Road();
        }
        return bike;
    }
}
