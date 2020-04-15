package strategypattern;

import strategypattern.socialnetworks.Facebook;
import strategypattern.students.*;

public class Main {

    public static void main(String[] args) {

        Student rakshith = new Indian("Rakshith");
        rakshith.useSocialNetwork();

        Student boris = new Russian("Boris");
        boris.useSocialNetwork();

        Student zhang = new Chinese("Zhang");
        zhang.useSocialNetwork();

        zhang.setSocialNetwork(new Facebook());
        zhang.changeSocialNetwork();
        zhang.useSocialNetwork();
    }
}
