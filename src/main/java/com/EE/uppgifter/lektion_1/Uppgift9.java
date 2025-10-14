package com.EE.uppgifter.lektion_1;

// Sealed interface hierarchy
sealed interface IAnimal permits IMammal, IReptile {
    String getType();
}

// Non-sealed så att andra klasser kan implementera IMammal
non-sealed interface IMammal extends IAnimal {
    default String getType() {
        return "Mammal";
    }
}

// Non-sealed så att andra klasser kan implementera IReptile
non-sealed interface IReptile extends IAnimal {
    default String getType() {
        return "Reptile";
    }
}

// Konkreta implementationer
class Lion implements IMammal {
    @Override
    public String getType() {
        return "Mammal - Lion";
    }
}

class Dolphin implements IMammal {
    @Override
    public String getType() {
        return "Mammal - Dolphin";
    }
}

class Snake implements IReptile {
    @Override
    public String getType() {
        return "Reptile - Snake";
    }
}

class Crocodile implements IReptile {
    @Override
    public String getType() {
        return "Reptile - Crocodile";
    }
}

// klass för att hantera djur
class AnimalUtil {

    // Polymorfism - tar emot IAnimal interface
    public static void identifyAnimal(IAnimal animal) {
        System.out.println("\nIdentifying animal...");
        System.out.println("Type: " + animal.getType());

        // instanceof för typkontroll
        if (animal instanceof IMammal) {
            System.out.println("✓ This is a MAMMAL");
            System.out.println("  - Warm-blooded");
            System.out.println("  - Has fur or hair");
            System.out.println("  - Gives birth to live young");
        } else if (animal instanceof IReptile) {
            System.out.println("✓ This is a REPTILE");
            System.out.println("  - Cold-blooded");
            System.out.println("  - Has scales");
            System.out.println("  - Lays eggs");
        }
    }

    // Pattern matching med instanceof (Java 16+)
    public static void identifyWithPatternMatching(IAnimal animal) {
        System.out.println("\nPattern matching:");

        if (animal instanceof IMammal mammal) {
            // 'mammal' variabeln är automatiskt tillgänglig här
            System.out.println("Mammal type: " + mammal.getType());
        } else if (animal instanceof IReptile reptile) {
            System.out.println("Reptile type: " + reptile.getType());
        }
    }
}

public class Uppgift9 {

    public static void main(String[] args) {

        System.out.println("=== UPPGIFT #9: Polymorfism med Sealed Interfaces ===");

        // Skapa olika djur
        IAnimal lion = new Lion();
        IAnimal dolphin = new Dolphin();
        IAnimal snake = new Snake();
        IAnimal crocodile = new Crocodile();

        // polymorfism - alla är IAnimal
        AnimalUtil.identifyAnimal(lion);
        AnimalUtil.identifyAnimal(dolphin);
        AnimalUtil.identifyAnimal(snake);
        AnimalUtil.identifyAnimal(crocodile);

        // Pattern matching
        System.out.println("\n=== Pattern Matching ===");
        AnimalUtil.identifyWithPatternMatching(lion);
        AnimalUtil.identifyWithPatternMatching(snake);

        // SLUTSATS
        System.out.println("\n=== KONCEPT ===");
        System.out.println("✓ Polymorfism: Alla djur är IAnimal");
        System.out.println("✓ Sealed: Begränsar vilka interfaces som kan ärva IAnimal");
        System.out.println("✓ Non-sealed: Öppnar upp för fler implementationer");
        System.out.println("✓ instanceof: Typcheckar runtime-typ");
        System.out.println("✓ Pattern matching: instanceof med automatisk cast");
        System.out.println("\nFördel: Kompilatorn garanterar att alla typer är hanterade!");
    }
}