import java.util.Random;

public class Dog extends Pet {
    /**
     *Dog loses hunger daily; simple random mood
     */
    public Dog(String name) {
        super(name);
    }

    // Testing changers (will expand later)
    @Override
    public void tick(Random rng) {
        bumpHunger(-12);
        bumpHygine(-6);
        bumpHappiness(rng.nextBoolean() ? 3 : -3);
    }
}
