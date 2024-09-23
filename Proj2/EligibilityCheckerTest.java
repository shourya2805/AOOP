package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EligibilityCheckerTest {
    @Test
    public void testEligibilityChecker() {
        Employee emp1 = new Employee("E001", "Alice", 30, true);
        Employee emp2 = new Employee("E002", "Bob", 45, false);
        
        EligibilityChecker checker = new EligibilityChecker();
        
        assertTrue(checker.checkEligibility(emp1));
        assertFalse(checker.checkEligibility(emp2));
    }
}