import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Make a Random Generator
        Random rng = new Random();

        // Create Dogg
        Dog puppy = new Dog("Puppy");

        // Print inital status
        System.out.println("Starting Status:");
        System.out.println(puppy.status());

        //advance a few days
        for (int day = 1; day <=5; day++) {
            puppy.tick(rng);
            System.out.println("Day "+ day + ": " + puppy.status());
        }

    }
}