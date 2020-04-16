package factory.bikes;

import factory.Bike;

public class Road extends Bike {

    @Override
    public String getDescription() {
        return "Road Bike";
    }

    @Override
    public int getCost() {
        return 500;
    }
}
