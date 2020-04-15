package strategypattern.students;

import strategypattern.Student;
import strategypattern.socialnetworks.Wechat;

public class Chinese extends Student {

    public Chinese(String name) {
        super(name);
        socialNetwork = new Wechat();
    }

    @Override
    public void useSocialNetwork() {
        socialNetwork.useIt(name);
    }

    @Override
    public void changeSocialNetwork() {
        System.out.print(name + " changed his Social Network, now ");
        socialNetwork.useIt(name);
    }
}
