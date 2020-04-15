package strategypattern.socialnetworks;

import strategypattern.SocialNetwork;

public class Wechat implements SocialNetwork {

    @Override
    public void useIt(String name) {
        System.out.println(name + " is using Wechat.");
    }
}
