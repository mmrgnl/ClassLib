import javax.naming.event.ObjectChangeListener;

public class Book {

    String name;
    String author;
    String genre;
    String code;

    public Book(String name, String author, String genre, String code) {

        this.name = name;
        this.author = author;
        this.genre = genre;
        this.code = code;

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Book)) return false;

        Book other = (Book) o;

        return (name == other.name && author == other.author && genre == other.genre && code== other.code);

    }
}

