package src;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class EnrollmentTest {
    @Test
    public void testEnrollmentCreation() {
        Employee employee = new Employee("E001", "Alice", 30, true);
        BenefitPlan plan = new BenefitPlan("P001", "Health Insurance", 250.00);
        Date enrollmentDate = new Date();
        
        Enrollment enrollment = new Enrollment(employee, plan, enrollmentDate);
        
        assertEquals(employee, enrollment.getEmployee());
        assertEquals(plan, enrollment.getBenefitPlan());
        assertEquals(enrollmentDate, enrollment.getEnrollmentDate());
    }
}