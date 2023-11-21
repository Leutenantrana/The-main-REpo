package part7.RandomMovie;
import java.util.List;
import java.util.ArrayList;

public class movie {

    String name;
    double rating;
    String genre;
    // List<String> descreption;
    
    public movie(String name,double rating, String genre ){
        this.name = name;
        this.rating= rating;
        this.genre =genre;
        
    }
    // public movie(String name, double rating, String genre,List<String> descreption ){
    //     this.name = name;
    //     this.rating= rating;
    //     this.genre =genre;
    //     this.descreption = descreption;

    // }


    

    public String getName(){
        return this.name;
    }

    public double getRating(){
        return this.rating;
    }

    public String getGenre(){
        return this.genre;
    }

    public String toString(){
        return "Watch "+ this.name + " \n" + "Rating : " + this.rating + " \n" + "Genre :" + this.genre ;
    }

    
}
