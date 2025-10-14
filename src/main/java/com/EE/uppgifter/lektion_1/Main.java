package com.EE.uppgifter.lektion_1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        int day = 3;
        String result;
        switch (day) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            default:
                result = "Unknown";
                break;
        }

        System.out.println(result);

    }
}
