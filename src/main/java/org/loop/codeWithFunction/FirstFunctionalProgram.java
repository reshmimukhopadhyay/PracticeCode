package org.loop.codeWithFunction;

import java.util.ArrayList;
import java.util.List;

import static org.loop.codeWithFunction.Person.GENDER.FEMALE;
import static org.loop.codeWithFunction.Person.GENDER.MALE;

public class FirstFunctionalProgram {

    public static void main(String[] args){
        List<Person> person = List.of(new Person("Lata", FEMALE),
                new Person("Manoj",MALE),
                new Person("Hari",MALE),
                new Person("Pintu",MALE),
                new Person("Seema",FEMALE),
                new Person("Simul",FEMALE));

        List<Person> femalePerson = new ArrayList<>();
        for (Person people:person) {
            if (FEMALE.equals(people.gender)) {
                femalePerson.add(people);
            }
        }
        for(Person fPerson : femalePerson){
            System.out.println(fPerson);
        }


    }


}
