package part8.Interfacepractice.p3;

public class CD implements Packable {

    String name;
    int publicationYear;
    String authorName;

    public CD(  String name,String authorName ,int publicationYear){
        this.name = name;
        this.publicationYear = publicationYear;
        this.authorName = authorName;
    }

    public String getName(){
        return this.name;

    }

    public int getPublicationYear(){
        return this.publicationYear;
    }

    public String toString(){
        return this.name + " : " +this.authorName  + "(" + this.publicationYear + ")";
    }

    @Override

    public double weight(){
        return 0.1;
    }
    
}
