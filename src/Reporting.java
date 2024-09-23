package src;
import java.util.List;

public class Reporting {
    public void generateEnrollmentReport(List<Enrollment> enrollments) {
        System.out.println("=== Enrollment Report ===");
        for (Enrollment enrollment : enrollments) {
            System.out.println("Employee: " + enrollment.getEmployee().getName() +
                               ", Plan: " + enrollment.getBenefitPlan().getPlanName() +
                               ", Enrollment Date: " + enrollment.getEnrollmentDate());
        }
    }
}
