package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EmployeeTest {
    @Test
    public void testEmployeeCreation() {
        Employee employee = new Employee("E001", "Alice", 30, true);
        
        assertEquals("E001", employee.getEmployeeId());
        assertEquals("Alice", employee.getName());
        assertEquals(30, employee.getAge());
        assertTrue(employee.isFullTime());
    }
}