package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTerst01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Fábio";
        professor.idade = 30;
        professor.sexo = 'M';
        System.out.println("Nome: " + professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}
