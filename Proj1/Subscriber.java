package Proj1;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String providerName, String content) {
        System.out.println(name + " received update from " + providerName + ": " + content);
    }

    public String getName() {
        return name;
    }
}
