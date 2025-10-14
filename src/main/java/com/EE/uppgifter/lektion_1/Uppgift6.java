package com.EE.uppgifter.lektion_1;

// Skapa en Record med en String variabel
record Student(String name) {
}

public class Uppgift6 {

    public static void main(String[] args) {

        System.out.println("=== UPPGIFT #6: Records ===\n");

        // Instansiera Record
        Student student = new Student("Alice");

        // Hämta värde med punkt-notation
        System.out.println("Student name: " + student.name());

        // Testa om det finns setters
        System.out.println("\n=== Testa metoder ===");

         // student. <-- Tryck punkt här och se vad som finns!

        // Records har automatiskt:
        System.out.println("name() getter: " + student.name());
        System.out.println("toString(): " + student.toString());
        System.out.println("hashCode(): " + student.hashCode());

        // Jämför två records
        Student student2 = new Student("Alice");
        System.out.println("equals(): " + student.equals(student2));

        // SLUTSATS
        System.out.println("\n=== SVAR PÅ FRÅGAN ===");
        System.out.println("Har Records getters? JA - name()");
        System.out.println("Har Records setters? NEJ - Records är IMMUTABLE!");
        System.out.println("\nRecords genererar automatiskt:");
        System.out.println("- Getters (name())");
        System.out.println("- toString()");
        System.out.println("- equals()");
        System.out.println("- hashCode()");
        System.out.println("- Constructor");
        System.out.println("\nRecords är IMMUTABLE - kan inte ändras efter skapande!");
    }
}