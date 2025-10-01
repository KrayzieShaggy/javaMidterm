/** Top of the hierarchy: shared name/id for living things. */
public abstract class Creature {
    protected final String name;

    protected Creature(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
