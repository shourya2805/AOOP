package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BenefitPlanTest {
    @Test
    public void testBenefitPlanCreation() {
        BenefitPlan plan = new BenefitPlan("P001", "Health Insurance", 250.00);
        
        assertEquals("P001", plan.getPlanId());
        assertEquals("Health Insurance", plan.getPlanName());
        assertEquals(250.00, plan.getMonthlyCost());
    }
}
