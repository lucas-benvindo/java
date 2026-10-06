package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Lucas"; //String constant pool
        String nome2 = "Lucas";
        nome = nome.concat(" Benvindo"); //nome += " Benvindo"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Lucas");  //1 variavel de referencia, 2 objeto do tipo String, 3 uma String no String pool
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
