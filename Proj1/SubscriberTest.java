package Proj1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubscriberTest {
    private Subscriber subscriber;

    @BeforeEach
    public void setup() {
        subscriber = new Subscriber("Alice");
    }

    @Test
    public void testSubscriberReceivesUpdate() {
        // Test receiving update
        subscriber.update("TechNews", "New article published");
        // Since the update method only prints to console, this test is mostly visual.
    }
}