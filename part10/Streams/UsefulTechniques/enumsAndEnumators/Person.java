package part10.Streams.UsefulTechniques.enumsAndEnumators;

import part8.Inheritence.practice.p1.person;

public class Person {
    
    private String name;
    private Education education;

    public Person(String name, Education education){
        this.name =name;
        this.education = education;
    }
    public Education getEducation(){
        return this.education;
    }

    public String toString(){
        return this.name + this.education;
    }
}
