package academy.devdojo.maratonajava.desafios.PayrollSystem.dominio;

import java.util.Arrays;

public class Company {
    private final String name;
    private Employee[] employees = new Employee[0];

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void registerEmployee(Employee newEmployee){
        employees = Arrays.copyOf(employees, employees.length + 1);
        employees[employees.length - 1] = newEmployee;
    }

    public void registerHours(String employeeName, int hours) {
        for (Employee employee : employees) {
            if (employee.getName().equals(employeeName)) {
                employee.setHoursWorked(hours);
                return;
            }
        }
        System.out.println("Employee not found: " + employeeName);
    }

    double calculateTotalPayroll() {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.calculatePayment();
        }
        return total;
    }

}
