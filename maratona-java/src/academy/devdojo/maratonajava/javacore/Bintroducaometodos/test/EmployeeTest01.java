package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Employee;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.UK);
        employee.salaries = new double[3];

        System.out.println("======== DATA ENTRY ========");
        System.out.print("Full Name: ");
        employee.name = scanner.nextLine();
        System.out.print("Age: ");
        employee.age = scanner.nextByte();
        scanner.nextLine(); //Clears the buffer
        for (int index = 0; index < employee.salaries.length; index++) { //Scans the user's three pay stubs
            System.out.print("Salary " + (index + 1) + ": £");
            employee.salaries[index] = scanner.nextDouble();
        }

        System.out.println("\n======== DATA PRINTER ========");
        employee.dataPrinter();

        System.out.println("\n======== AVERAGE SALARY ========");
        employee.averageSalary();
    }
}