package strategypattern.students;

import strategypattern.Student;
import strategypattern.socialnetworks.Vk;

public class Russian extends Student {

    public Russian(String name) {
        super(name);
        socialNetwork = new Vk();
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
