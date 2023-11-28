package part10.Streams.ComparableClass.ComparatorClass.practice;

public class Book {

    String bookName;
    int recommendationAge;
    public Book(String book, int age){
        this.bookName = book;
        this.recommendationAge = age;
    }

    public String getBookName(){
        return this.bookName;
    }
    public int getAge(){
        return this.recommendationAge;
    }
    public String toString(){
        return this.bookName + "(" + " The recommended age is " + this.recommendationAge + ")";
    }
}
