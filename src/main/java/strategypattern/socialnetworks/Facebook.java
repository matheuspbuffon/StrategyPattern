package strategypattern.socialnetworks;

import strategypattern.SocialNetwork;

public class Facebook implements SocialNetwork {

    @Override
    public void useIt(String name) {
        System.out.println(name + " is using Facebook.");
    }
}
