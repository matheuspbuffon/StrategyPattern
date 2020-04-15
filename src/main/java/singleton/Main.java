package singleton;

public class Main {

    public static void main(String[] args) {

        Steering steering1 = Steering.getUniqueInstance();
        Steering steering2 = Steering.getUniqueInstance();

        System.out.println(steering1);
        System.out.println(steering2);
    }
}
