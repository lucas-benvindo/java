package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Employee {
    public String name;
    public byte age;
    public double[] salaries;

    public void dataPrinter() {
        System.out.println("Employee name: " + this.name);
        System.out.println("Employee age: " + this.age);
        for (int index = 0; index < salaries.length; index++) { //Prints the user's three salaries.
            System.out.printf("Employee salary %d: £%.2f%n", (index + 1), salaries[index]);
        }
    }

    public void averageSalary() {
        double total = 0;
        for (double salary : salaries) {
            total += salary;
        }
        double average = total / salaries.length; //Average user salary
        System.out.printf("Average salary: £%.2f%n", average);
    }
}