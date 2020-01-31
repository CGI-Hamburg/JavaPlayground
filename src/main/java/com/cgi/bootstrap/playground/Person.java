package com.cgi.bootstrap.playground;

public class Person extends Object{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "name: " + name+ "\n"+
                "age: " + age+ "\n";
    }

    @Override
    public boolean equals(final Object other) {
        if(other instanceof Person){
            Person otherPerson = (Person) other;
            return  this.name.equals(otherPerson.name) &&
                    this.age == otherPerson.age;
        }
        return false;
    }

    public static void main(String args[]){
        Person person = new Person("Arya Stark", 18);
        Person person2 = new Person("Sansa Stark", 20);
    Person person3 = person;
        if(person.equals(person2)){
            System.out.println("Die Personen sind gleich"); // TODO remove
        }else {
            System.out.println("Die Personen sind NICHT gleich"); // TODO remove
        }
        System.out.println(person);
    }

}
