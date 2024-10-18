import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author (String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }

    public String toString() {
        return "Author:" + " " +
                "Имя автора=" + " " + nameAuthor + "," + " " +
                "Фамилия автора=" + " " + surnameAuthor ;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null || other.getClass() != getClass()) return false;
        Author otherAuthor = (Author) other;
        return nameAuthor.equals(otherAuthor.nameAuthor) &&
                surnameAuthor.equals(otherAuthor.surnameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor,surnameAuthor);
    }




}
