package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car01 = new Car();
        car01.name = "Toyota";
        car01.model = "Corolla";
        car01.year = 2020;

        System.out.println("Carro 01");
        System.out.println("Name: " + car01.name);
        System.out.println("Model: " + car01.model);
        System.out.println("Year: " + car01.year);

        Car car02 = car01;

        System.out.println("\nCarro 02");
        System.out.println("Name: " + car02.name);
        System.out.println("Model: " + car02.model);
        System.out.println("Year: " + car02.year);
    }
}
