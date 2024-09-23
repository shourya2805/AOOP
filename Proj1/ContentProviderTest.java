package Proj1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContentProviderTest {
    private ContentProvider provider;
    private Subscriber subscriber1;
    private Subscriber subscriber2;

    @BeforeEach
    public void setup() {
        provider = new ContentProvider("TechNews");
        subscriber1 = new Subscriber("Alice");
        subscriber2 = new Subscriber("Bob");
    }

    @Test
    public void testSubscriptionAndNotification() {
        // Subscribe the subscribers
        provider.subscribe(subscriber1);
        provider.subscribe(subscriber2);

        // Notify subscribers (visually check output)
        provider.notifySubscribers("New tech article published.");
    }

    @Test
    public void testUnsubscribe() {
        // Subscribe and then unsubscribe subscriber2
        provider.subscribe(subscriber1);
        provider.subscribe(subscriber2);
        provider.unsubscribe(subscriber2);

        // Notify subscribers (visually check output)
        provider.notifySubscribers("Another tech article published.");

        // Only subscriber1 should receive the update
    }
}