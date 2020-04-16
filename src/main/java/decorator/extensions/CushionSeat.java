package decorator.extensions;

import decorator.CarExtension;

public class CushionSeat implements CarExtension {

    CarExtension carExtension;

    public CushionSeat(CarExtension carExtension) {
        this.carExtension = carExtension;
    }

    @Override
    public String getDescription() {
        return carExtension.getDescription() + ", CushionSeat";
    }

    @Override
    public int getCost() {
        return carExtension.getCost() + 50;
    }
}
