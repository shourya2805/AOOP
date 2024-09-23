package Proj1;

public class Main {
    public static void main(String[] args) {
        // Create content providers
        ContentProvider provider1 = new ContentProvider("TechNews");
        ContentProvider provider2 = new ContentProvider("SportsDaily");

        // Create subscribers
        Subscriber subscriber1 = new Subscriber("Shourya");
        Subscriber subscriber2 = new Subscriber("Sahasi");

        // Subscribe to content providers
        provider1.subscribe(subscriber1);
        provider1.subscribe(subscriber2);
        provider2.subscribe(subscriber2);

        // Publish updates
        provider1.notifySubscribers("Latest technology trends in 2024");
        provider2.notifySubscribers("Breaking: Team A wins the championship!");

        // Unsubscribe and test
        provider1.unsubscribe(subscriber2);
        provider1.notifySubscribers("TechNews: New gadget review.");
    }
}
