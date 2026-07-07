package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Educador[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (professores == null) return;
        for (Educador professor : professores) {
            System.out.println(professor.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Educador[] getProfessores() {
        return professores;
    }

    public void setProfessores(Educador[] professores) {
        this.professores = professores;
    }
}
