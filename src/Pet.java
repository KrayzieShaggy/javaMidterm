import java.util.Random;

/**
 * Abstract Pet: shared stats + minimal behavior.
 * Multilevel chain: Creature -> Pet -> (Dog/Cat)
 */
public abstract class Pet extends Creature {
    // Keep stats super simple for now; 0..100
    protected int hunger = 50;
    protected int hygiene = 50;
    protected int happiness = 50;

    protected Pet(String name) { super(name); }

    /** Minimal readable status line. */
    public String status() {
        return String.format("%s  HUN:%d  HYG:%d  HAP:%d", name, hunger, hygiene, happiness);
    }
    public abstract void tick(Random rng);

    protected void bumpHunger(int d) {
        hunger = clamp(hunger + d);
    }
    protected void bumpHygine(int d) {
        hygiene = clamp(hygiene +d);
    }
    protected void bumpHappiness(int d) {
        happiness = clamp(happiness +d);
    }

    protected int clamp(int v) {
        return Math.max(0, Math.min(100, v));
    }
}