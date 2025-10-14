package com.EE.uppgifter.lektion_1;

import java.util.Arrays;
import java.util.List;

public class Uppgift4 {

    public static void main(String[] args) {
        System.out.println(" UPPGIFT #4 \n");

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        System.out.println("Names: " + names);

        int day = 3;
        String result;
        switch (day) {
            case 1: result = "Monday"; break;
            case 2: result = "Tuesday"; break;
            case 3: result = "Wednesday"; break;
            default: result = "Unknown"; break;
        }
        System.out.println("Result: " + result);

        Person person = new Person("Alice", 30);
        System.out.println("Person: " + person);
    }
}  // Uppgift 4 slutar här

// Person BÖRJAR HÄR - utanför Uppgift4!
class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}