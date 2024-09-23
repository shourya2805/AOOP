package src;
import java.util.Date;

public class Enrollment {
    private Employee employee;
    private BenefitPlan benefitPlan;
    private Date enrollmentDate;

    public Enrollment(Employee employee, BenefitPlan benefitPlan, Date enrollmentDate) {
        this.employee = employee;
        this.benefitPlan = benefitPlan;
        this.enrollmentDate = enrollmentDate;
    }

    public Employee getEmployee() { return employee; }
    public BenefitPlan getBenefitPlan() { return benefitPlan; }
    public Date getEnrollmentDate() { return enrollmentDate; }
}

