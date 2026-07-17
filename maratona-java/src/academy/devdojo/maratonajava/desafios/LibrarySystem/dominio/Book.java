package academy.devdojo.maratonajava.desafios.LibrarySystem.dominio;

public class Book {
    private final String title;
    private final String[] authors;
    private final String isbn;
    private Member member;
    private Library library;

    public Book(String title, String[] authors, String isbn) {
        this.title = title;
        this.authors = authors;
        this.isbn = isbn;
    }

    public Member getMember() {
        return member;
    }

    // package-private: only Library/Member (same package) should link this association
    void setMember(Member member) {
        this.member = member;
    }

    public String getTitle() {
        return title;
    }

    // returns a copy, not the original reference, to protect internal state
    public String[] getAuthors() {
        return authors.clone();
    }

    public String getIsbn() {
        return isbn;
    }

    public Library getLibrary() {
        return library;
    }

    void setLibrary(Library library) {
        this.library = library;
    }
}
