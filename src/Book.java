public class Book {
    String name;
    Author author;
    int year;

    public Book(Author author, int year, String name) {
        this.author = author;
        this.year = year;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return name + " от автора " + author + ", опубликонван в " + year;
    }
}
