package academy.devdojo.maratonajava.desafios.PayrollSystem.test;

import academy.devdojo.maratonajava.desafios.PayrollSystem.domain.CLT;
import academy.devdojo.maratonajava.desafios.PayrollSystem.domain.Company;
import academy.devdojo.maratonajava.desafios.PayrollSystem.domain.Intern;
import academy.devdojo.maratonajava.desafios.PayrollSystem.domain.PJ;

public class PayrollSystemTest01 {

    public static void main(String[] args) {
        Company apple = new Company("Apple");

        CLT lucas = new CLT("Lucas", 1621, 10);
        PJ agatha = new PJ("Agatha", 40, 20, 160);
        Intern laura = new Intern("Laura", 1000);

        apple.registerEmployee(lucas);
        apple.registerEmployee(agatha);
        apple.registerEmployee(laura);

        apple.registerHours("Lucas", 240);
        apple.registerHours("Agatha", 190);
        apple.registerHours("Laura", 100);

        apple.printAllPayslips();
        apple.printTotalPayroll();
    }
}