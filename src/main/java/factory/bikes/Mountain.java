package factory.bikes;

import factory.Bike;

public class Mountain extends Bike {

    @Override
    public String getDescription() {
        return "Mountain Bike";
    }

    @Override
    public int getCost() {
        return 5000;
    }
}
