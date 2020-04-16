package factory.bikes;

import factory.Bike;

public class Dirt extends Bike {

    @Override
    public String getDescription() {
        return "Dirt Bike";
    }

    @Override
    public int getCost() {
        return 1000;
    }
}
