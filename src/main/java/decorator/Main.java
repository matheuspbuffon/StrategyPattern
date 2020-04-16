package decorator;

import decorator.extensions.MusicSystem;

public class Main {

    public static void main(String[] args) {

        CarExtension extension = new MusicSystem(new BasicCar());
        System.out.println(extension.getDescription());
    }
}
