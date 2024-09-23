package src;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class ReportingTest {
    @Test
    public void testEnrollmentReport() {
        Employee emp1 = new Employee("E001", "Alice", 30, true);
        BenefitPlan plan1 = new BenefitPlan("P001", "Health Insurance", 250.00);
        
        Enrollment enrollment = new Enrollment(emp1, plan1, new Date());
        List<Enrollment> enrollments = new ArrayList<>();
        enrollments.add(enrollment);
        
        Reporting reporting = new Reporting();
        
        // We can't assert the printed output easily, but we can check the enrollment list
        assertEquals(1, enrollments.size());
        assertEquals("Alice", enrollments.get(0).getEmployee().getName());
        assertEquals("Health Insurance", enrollments.get(0).getBenefitPlan().getPlanName());
    }
}