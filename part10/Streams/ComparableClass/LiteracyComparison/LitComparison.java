package part10.Streams.ComparableClass.LiteracyComparison;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.IOException;





public class LitComparison implements Comparable<LitComparison> {
    String country;
    int year;
    String gender;
    double percent;

    public LitComparison(String country, int year, String gender, double percent){
        this.gender = gender;
        this.country = country;
        this.percent = percent;
        this.year = year;
    }

    public String getCountryNamer(){
        return this.country;
    }
    public int getYear(){
        return this.year;
    }
    public String getGender(){
        return this.gender;
    }
    public double getPercent(){
        return this.percent;
    }
    public String toString(){
        return this.country + "(" + this.year + ")," + this.gender +", " + this.percent;
    }

    @Override
    public int compareTo(LitComparison country ){
        return (int)(this.percent - country.getPercent());
    }

}

