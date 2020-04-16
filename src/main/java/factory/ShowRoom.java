package factory;

public class ShowRoom {

    public static void main(String[] args) {

        String bikeName = "DirtBike";
        Bike bike = Factory.createBike(bikeName);
        System.out.println(bike.getDescription());
        System.out.println(bike.getCost());
    }
}
