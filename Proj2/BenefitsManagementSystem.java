package src;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BenefitsManagementSystem {
    public static void main(String[] args) {
        // Sample Employees
        Employee emp1 = new Employee("E001", "Alice", 30, true);
        Employee emp2 = new Employee("E002", "Bob", 45, false);

        // Sample Benefit Plans
        BenefitPlan plan1 = new BenefitPlan("P001", "Health Insurance", 250.00);
        BenefitPlan plan2 = new BenefitPlan("P002", "Retirement Plan", 150.00);

        // Enrollment list
        List<Enrollment> enrollments = new ArrayList<>();

        // Eligibility Checker
        EligibilityChecker checker = new EligibilityChecker();

        // Attempt to enroll employees
        if (checker.checkEligibility(emp1)) {
            enrollments.add(new Enrollment(emp1, plan1, new Date()));
            System.out.println(emp1.getName() + " successfully enrolled in " + plan1.getPlanName());
        } else {
            System.out.println(emp1.getName() + " is not eligible for " + plan1.getPlanName());
        }

        if (checker.checkEligibility(emp2)) {
            enrollments.add(new Enrollment(emp2, plan2, new Date()));
            System.out.println(emp2.getName() + " successfully enrolled in " + plan2.getPlanName());
        } else {
            System.out.println(emp2.getName() + " is not eligible for " + plan2.getPlanName());
        }

        // Generate Reports
        Reporting reporting = new Reporting();
        reporting.generateEnrollmentReport(enrollments);
    }
}
