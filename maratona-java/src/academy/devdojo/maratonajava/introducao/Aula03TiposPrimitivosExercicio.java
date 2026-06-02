package academy.devdojo.maratonajava.introducao;

/*
  PRÁTICA

  Crie Variávéis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

  Eu <nome>, morando no endereço <endereço>,
  confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Lucas";
        String endereco = "Rua Francisco de Barros Cobra - 54";
        double salario = 5409.12;
        String dataRecebimentoSalario = "25/05/2026";
        //String relatorio = "Eu " + nome + " morando no endereço " + endereco + " confirmo que recebi o salário de " + salario + " reais na data " + dataRecebimentoSalario;
        System.out.println("Eu " + nome + " morando no endereço " + endereco + " confirmo que recebi o salário de " + salario + " reais na data " + dataRecebimentoSalario);
    }
}
