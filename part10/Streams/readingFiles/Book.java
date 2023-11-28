package part10.Streams.readingFiles;

public class Book {
    private String author;
    private String name;
    private int pages;
    private int publishingYear;

    public Book( String name,int publishingYear,int pages, String author) {
        this.author = author;
        this.name = name;
        this.pages = pages;
        this.publishingYear = publishingYear;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getPages() {
        return this.pages;
    }

    public String toString(){
        return this.name + " (" + this.publishingYear + ") " + ":"+this.author;
    }
}
