package org.example;

public class Person {
    private String name;
    private String email;
    private String country;

    public Person(String name, String email, String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }

    public void PrintPerson() {
        System.out.printf("%s %s %s\n", name, email, country);
    }
}
