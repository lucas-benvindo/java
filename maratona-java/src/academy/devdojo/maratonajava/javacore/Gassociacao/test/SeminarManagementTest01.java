package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Location;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminar;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Student;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Teacher;

public class SeminarManagementTest01 {
    public static void main(String[] args) {
        Location location = new Location("Rua Francisco");

        Seminar seminar = new Seminar("Água", location);

        Student student1 = new Student("Lucas", 18);
        Student student2 = new Student("Agatha", 18);

        seminar.addStudents(student1);
        seminar.addStudents(student2);

        Teacher teacher = new Teacher("João", "Mathematics");
        teacher.addSeminars(seminar);

        teacher.dataPrinter();
    }
}
