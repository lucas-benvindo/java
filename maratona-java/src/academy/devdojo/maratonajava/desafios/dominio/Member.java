package academy.devdojo.maratonajava.desafios.dominio;

public class Member {
    private String name;
    private String registrationCode;
    private Book[] books = new Book[0];
    private Library[] libraries = new Library[0];

    public Member(String name) { //FIRST TIME AT THE LIBRARY
        this.name = name;
    }

    public void borrowBook(Book newBook) {
        boolean isMember = false;
        for (int index = 0; index < libraries.length; index++) {
            if (newBook.getLibrary() == libraries[index]) {
                isMember = true;
            }
        }
        if (newBook.getMember() != null) {
            System.out.println(this.name + " could not borrow \"" + newBook.getTitle() + "\": already lent out to " + newBook.getMember().getName());
        } else if (!isMember) {
            System.out.println(this.name + " could not borrow \"" + newBook.getTitle() + "\": not a member of " + newBook.getLibrary().getName());
        } else {
            Book[] newArrayBooks = new Book[books.length + 1];
            for (int index = 0; index < books.length; index++) {
                newArrayBooks[index] = books[index];
            }
            newArrayBooks[books.length] = newBook;
            books = newArrayBooks;
            newBook.setMember(this);
            System.out.println(this.name + " borrowed \"" + newBook.getTitle() + "\"");
        }
    }

    public void returnBook(Book usedBook) {
        int position = -1;
        for (int index = 0; index < books.length; index++) {
            if (books[index] == usedBook) {
                position = index;
                break;
            }
        }

        if (position == -1) {
            System.out.println(this.name + " could not return \"" + usedBook.getTitle() + "\": this book was not borrowed by " + this.name);
            return;
        }

        Book[] newArrayBooks = new Book[books.length - 1];
        int newIndex = 0;
        for (int oldIndex = 0; oldIndex < books.length; oldIndex++) {
            if (oldIndex != position) {
                newArrayBooks[newIndex] = books[oldIndex];
                newIndex++;
            }
        }
        books = newArrayBooks;
        usedBook.setMember(null);
        System.out.println(this.name + " returned \"" + usedBook.getTitle() + "\"");
    }

    void addLibrary(Library newlibrary) {
        Library[] newArrayLibraries = new Library[libraries.length + 1];
        for (int index = 0; index < libraries.length; index++) {
            newArrayLibraries[index] = libraries[index];
        }
        newArrayLibraries[libraries.length] = newlibrary;
        libraries = newArrayLibraries;
    }

    public String getName() {
        return name;
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
    }

    public Book[] getBooks() {
        return books.clone();
    }

    public Library[] getLibraries() {
        return libraries.clone();
    }
}
