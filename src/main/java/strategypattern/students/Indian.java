package strategypattern.students;

import strategypattern.Student;
import strategypattern.socialnetworks.Facebook;

public class Indian extends Student {

    public Indian(String name) {
        super(name);
        socialNetwork = new Facebook();
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
