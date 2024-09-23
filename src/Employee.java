package src;

public class Employee {
    private String employeeId;
    private String name;
    private int age;
    private boolean isFullTime;

    public Employee(String employeeId, String name, int age, boolean isFullTime) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.isFullTime = isFullTime;
    }

    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isFullTime() { return isFullTime; }
}
