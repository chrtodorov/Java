package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Person> people = new ArrayList<>();
        try(BufferedReader br = Files.newBufferedReader(Paths.get("src/main/resources/users.csv"))) {
            String delimiter = ",";
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(delimiter);
                String name = columns[0];
                String email = columns[1];
                String country = columns[2];
                people.add(new Person(name, email, country));

            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }

        for (Person p : people) {
            p.PrintPerson();
        }
    }
}