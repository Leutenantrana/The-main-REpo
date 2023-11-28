package part11.ErrorHandling;

public class Person {
    String name;
    int age;

    public Person(String name, int age){
        if (name.equals(null)) {
            throw new IllegalArgumentException("Input is Null!! ");
            
        }else if ( name.length()>40) {
            throw new IllegalArgumentException("The name is too long to be a name!!");
            
        }
        this.name = name;

        if (age<0|| age>120) {
            throw new IllegalArgumentException("The age can't be 0 or greater than 120");
            
        }
        this.age = age;
    }

    public String toString(){
        return this.name + " " +this.age;
    }
    


    public static void main(String[] args) {
        // Person person = new Person("lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll", 12);
        // System.out.println(person);
        Person p2 = new Person("sagar", 121);
        System.out.println("p2");
    }
}
