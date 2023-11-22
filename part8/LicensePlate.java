package part8;
import java.util.Objects;
public class LicensePlate {
    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public boolean equals(Object comparedObject){

        if(this == comparedObject){
            return true;

        }
        if(!(comparedObject instanceof LicensePlate )) {
            return false;
        }

        LicensePlate comparedLicencePlate = (LicensePlate) comparedObject;
        if(this.liNumber.equals(comparedLicencePlate.liNumber)&& this.country.equals(comparedLicencePlate.country)){
            return true;
        }

        return false;
    }

    public int hashCode() {
        return Objects.hash(liNumber, country);
    }
}
