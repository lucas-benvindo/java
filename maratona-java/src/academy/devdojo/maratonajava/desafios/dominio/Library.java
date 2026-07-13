package academy.devdojo.maratonajava.desafios.dominio;

import java.util.Arrays;

public class Library {
    private String name;
    private Book[] books = new Book[0];
    private Member[] members = new Member[0];

    public Library(String name) {
        this.name = name;
    }

    public void registerBook(Book newBook) {
        for (Book book : books) {
            if (book == newBook) {
                System.out.println(newBook.getTitle() + " is already registered in this library");
                return;
            }
        }

        if (newBook.getLibrary() != null) {
            System.out.println(newBook.getTitle() + " already belongs to another library");
            return;
        }

        Book[] newArrayRegisteredBooks = new Book[books.length + 1];
        for (int index = 0; index < books.length; index++) {
            newArrayRegisteredBooks[index] = books[index];
        }
        newArrayRegisteredBooks[books.length] = newBook;
        books = newArrayRegisteredBooks;
        newBook.setLibrary(this);
    }

    public void registerMember(Member newMember) {
        for (Member member : members) {
            if (member == newMember) {
                System.out.println(newMember.getName() + " is already registered in this library");
                return;
            }
        }

        newMember.setRegistrationCode(String.format("%03d", members.length + 1));

        Member[] newArrayRegisteredMembers = new Member[members.length + 1];
        for (int index = 0; index < members.length; index++) {
            newArrayRegisteredMembers[index] = members[index];
        }
        newArrayRegisteredMembers[members.length] = newMember;
        members = newArrayRegisteredMembers;
        newMember.addLibrary(this);
    }

    public void dataPrinter() {
        System.out.println("\nLibrary: " + this.name);
        System.out.println("==================");

        System.out.println("\n--- Collection ---");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author(s): " + Arrays.toString(book.getAuthors()));
            System.out.println("ISBN: " + book.getIsbn());
            if (book.getMember() == null) {
                System.out.println("Status: Available");
            } else {
                System.out.println("Status: Borrowed by " + book.getMember().getName());
            }
            System.out.println("------");
        }

        System.out.println("\n--- Members ---");
        for (Member member : members) {
            System.out.println("Name: " + member.getName());
            System.out.println("Registration code: " + member.getRegistrationCode());
            Book[] borrowedBooks = member.getBooks();
            System.out.println("Books borrowed: " + borrowedBooks.length);
            for (Book borrowedBook : borrowedBooks) {
                System.out.println(" - " + borrowedBook.getTitle());
            }
            System.out.println("------");
        }
    }

    public Book[] getBooks() {
        return books.clone();
    }

    public Member[] getMembers() {
        return members.clone();
    }

    public String getName() {
        return name;
    }
}
