package decorator.extensions;

import decorator.CarExtension;

public class RearCamera implements CarExtension {

    CarExtension carExtension;

    public RearCamera(CarExtension carExtension) {
        this.carExtension = carExtension;
    }

    @Override
    public String getDescription() {
        return carExtension.getDescription() + ", RearCamera";
    }

    @Override
    public int getCost() {
        return carExtension.getCost() + 50;
    }
}
