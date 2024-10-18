import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearPublication;

    public Book (String name, Author author, int yearPublication) {
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getNameBook() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String toString() {
        return "Book:" +
                "Название книги=" + " " + name + ", " +
                "Автор книги=" + author + ", " +
                "Год публикации книги=" + yearPublication;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null || other.getClass() != getClass()) return false;
        Book otherBook = (Book) other;
        return name.equals(otherBook.name) &&
                author.equals(otherBook.author) &&
                yearPublication == otherBook.yearPublication;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name,author,yearPublication);
        }

}
