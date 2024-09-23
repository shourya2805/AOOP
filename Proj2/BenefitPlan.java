package src;

public class BenefitPlan {
    private String planId;
    private String planName;
    private double monthlyCost;

    public BenefitPlan(String planId, String planName, double monthlyCost) {
        this.planId = planId;
        this.planName = planName;
        this.monthlyCost = monthlyCost;
    }

    public String getPlanId() { return planId; }
    public String getPlanName() { return planName; }
    public double getMonthlyCost() { return monthlyCost; }
}
