package org.artem.projects;

import org.example.CSVWriter;
import org.example.Person;
import org.example.RedisMap;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Person firstPerson = new Person("Vava", "Vavava", 23, 180);
        List<Person> persons = new ArrayList<>();
        persons.add(firstPerson);
        CSVWriter writer = new CSVWriter();
        try {
            writer.writeToFile(persons, "C:\\prog\\library-use-example\\src\\main\\resources\\file1.csv");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        RedisMap redis = new RedisMap();
        System.out.println(redis.put("oleg", "burn"));
        redis.put("artem", "tornado");
        redis.put("mihail", "flash");
        System.out.println(redis.get("artem"));
        System.out.println(redis.get("oleg"));
        System.out.println(redis.get("mihail"));
    }
}
