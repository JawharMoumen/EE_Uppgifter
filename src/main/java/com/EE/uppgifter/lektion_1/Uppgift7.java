package com.EE.uppgifter.lektion_1;

public class Uppgift7 {

    public static void main(String[] args) {

        System.out.println("=== UPPGIFT #7: Enhanced Switch ===\n");

        // Traditionell switch med breaks (Java 8)
        System.out.println("Traditionell switch:");
        int day = 2;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            default:
                dayName = "Unknown";
                break;
        }

        System.out.println("Day: " + dayName);

        // Enhanced switch (Java 14+)

        System.out.println("\nEnhanced switch:");

        String enhancedDay = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Unknown";
        };

        System.out.println("Day: " + enhancedDay);

        // Mer avancerat exempel med block
        System.out.println("\nMed block:");

        String message = switch (day) {
            case 1 -> {
                System.out.println("Start of week!");
                yield "Monday";
            }
            case 2, 3, 4 -> "Weekday";  // Flera cases
            case 5 -> "Friday!";
            default -> "Weekend or invalid";
        };

        System.out.println("Message: " + message);

        // SLUTSATS
        System.out.println("\n=== FÖRDELAR MED ENHANCED SWITCH ===");
        System.out.println("✓ Ingen 'break' behövs");
        System.out.println("✓ Kan returnera värde direkt");
        System.out.println("✓ Inget fall-through (säkrare)");
        System.out.println("✓ Mer koncis kod");
        System.out.println("✓ Kan ha flera cases: case 1, 2, 3 ->");
        System.out.println("✓ Använd 'yield' för att returnera från block");
    }
}