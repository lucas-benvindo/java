package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Lucas");
        Professor professor2= new Professor("Kauã");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Colégio Nova Geração");
        escola.setProfessores(professores);
        escola.imprime();
    }
}
