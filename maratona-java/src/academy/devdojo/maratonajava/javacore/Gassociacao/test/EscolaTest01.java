package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Educador;

public class EscolaTest01 {
    public static void main(String[] args) {
        Educador professor1 = new Educador("Lucas");
        Educador professor2= new Educador("Kauã");
        Educador[] professores = {professor1, professor2};
        Escola escola = new Escola("Colégio Nova Geração");
        escola.setProfessores(professores);
        escola.imprime();
    }
}
