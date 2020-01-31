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

    public static void main(String args[]){
        Person person = new Person("Arya Stark", 18);


        System.out.println(person);
    }

}
