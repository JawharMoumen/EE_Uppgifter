package com.EE.uppgifter.lektion_1;

// Sealed interface - endast Dog och Cat får implementera det
sealed interface Animal permits Dog, Cat {
    String makeSound();
}

// Dog implementerar Animal - måste vara final, sealed eller non-sealed
final class Dog implements Animal {
    @Override
    public String makeSound() {
        return "Woof!";
    }
}

// Cat implementerar Animal
final class Cat implements Animal {
    @Override
    public String makeSound() {
        return "Meow!";
    }
}

// Denna klass kan INTE implementera Animal:
// class Bird implements Animal { }  //  FEL! Inte i permits

public class Uppgift8 {

    public static void main(String[] args) {

        System.out.println("=== UPPGIFT #8: Sealed Interfaces ===\n");

        // Skapa djur
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Använd polymorfism
        System.out.println("Dog says: " + dog.makeSound());
        System.out.println("Cat says: " + cat.makeSound());

        // Pattern matching med sealed types
        System.out.println("\n=== Pattern Matching ===");
        printAnimalType(dog);
        printAnimalType(cat);

        // SLUTSATS
        System.out.println("\n=== FÖRDELAR MED SEALED ===");
        System.out.println("✓ Begränsar vilka klasser som kan implementera");
        System.out.println("✓ Bättre kontroll över arvshierarki");
        System.out.println("✓ Kompilatorn kan verifiera exhaustiveness");
        System.out.println("✓ Tydliggör designintention");
        System.out.println("\nKeywords:");
        System.out.println("- sealed: Begränsar arv");
        System.out.println("- permits: Specificerar tillåtna subtyper");
        System.out.println("- final: Klassen kan inte ärvas vidare");
        System.out.println("- non-sealed: Öppnar upp för vidare arv");
    }

    // Pattern matching med sealed types
    static void printAnimalType(Animal animal) {
        // Kompilatorn vet att det bara kan vara Dog eller Cat
        if (animal instanceof Dog) {
            System.out.println("This is a dog!");
        } else if (animal instanceof Cat) {
            System.out.println("This is a cat!");
        }

    }
}