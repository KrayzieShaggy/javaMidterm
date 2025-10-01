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
}
testting