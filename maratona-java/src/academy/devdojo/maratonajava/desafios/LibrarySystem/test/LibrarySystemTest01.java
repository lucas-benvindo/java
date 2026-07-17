package academy.devdojo.maratonajava.desafios.LibrarySystem.test;

import academy.devdojo.maratonajava.desafios.LibrarySystem.dominio.Book;
import academy.devdojo.maratonajava.desafios.LibrarySystem.dominio.Library;
import academy.devdojo.maratonajava.desafios.LibrarySystem.dominio.Member;

public class LibrarySystemTest01 {
    public static void main(String[] args) {
        Member joao = new Member("João");
        Member fabio = new Member("Fábio");
        Member maria = new Member("Maria");

        Book animalFarm = new Book("Animal Farm", new String[]{"George Orwell"}, "9780194267533");
        Book prideAndPrejudice = new Book("Pride and Prejudice", new String[]{"Jane Austen"}, "9781428108325");
        Book sherlockHolmes = new Book("Sherlock Holmes", new String[]{"Arthur Conan Doyle"}, "9780385006897");

        Library britishLibrary = new Library("British Library");
        Library theJohnRylandsLibrary = new Library("The John Rylands Library");

        britishLibrary.registerMember(joao);
        britishLibrary.registerMember(maria);
        britishLibrary.registerMember(joao);

        theJohnRylandsLibrary.registerMember(fabio);

        britishLibrary.registerBook(animalFarm);
        britishLibrary.registerBook(sherlockHolmes);

        theJohnRylandsLibrary.registerBook(prideAndPrejudice);

        joao.borrowBook(animalFarm);
        maria.borrowBook(sherlockHolmes);

        fabio.borrowBook(prideAndPrejudice);
        fabio.borrowBook(prideAndPrejudice);

        joao.returnBook(animalFarm);

        britishLibrary.dataPrinter();
        theJohnRylandsLibrary.dataPrinter();
    }
}
