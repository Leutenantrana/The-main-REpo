package part8.equal;

public class simpleDate {

    private int day;
    private int month;
    private int year;

    // Constructor
    public simpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getter methods
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean equals(simpleDate date){
        return this.day == date.day || this.month == date.month || this.year == date.year;
    }

    public int hashCode() {
        // A simple hash code calculation, trying to minimize collisions between 1900 and 2100
        int result = 17;  // starting with a prime number
        result = 31 * result + day;
        result = 31 * result + month;
        result = 31 * result + (year - 1900);  // normalizing the year
        return result;
    }

  
    
}
