package strategypattern;

public abstract class Student {

    protected String name;
    protected SocialNetwork socialNetwork;

    public Student(String name) {
        this.name = name;
    }

    public abstract void useSocialNetwork();
    public abstract void changeSocialNetwork();

    public void setSocialNetwork(SocialNetwork socialNetwork) {
        this.socialNetwork = socialNetwork;
    }
}
