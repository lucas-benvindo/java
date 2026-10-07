package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Lucas Benvindo";
        nome.concat( " da Silva Costa");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuffer sb = new StringBuffer("Lucas Benvindo");
        sb.append(" da Silva").append(" Costa");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
