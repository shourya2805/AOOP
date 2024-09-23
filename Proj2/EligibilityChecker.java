package src;

public class EligibilityChecker {
    public boolean checkEligibility(Employee employee) {
        // Assuming eligibility is based on full-time status
        return employee.isFullTime();
    }
}
