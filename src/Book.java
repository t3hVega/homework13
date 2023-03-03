public class Book {
    private String title;
    private Author author;
    private int year;
    public Book (String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return title + ", published in " + year;
    }
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b2 = (Book) other;
        return title.equals(b2.title);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hashCode(title);
    }
}
