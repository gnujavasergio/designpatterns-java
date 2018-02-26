
/**
 * Sheep
 *
 * @author sochoa
 */
public class Sheep extends BeastPrototype {

    private static final int SHEEP_DEFENSE = 2;
    private static final int SHEEP_MANA = 4;

    public Sheep() {
        defense = SHEEP_DEFENSE;
        mana = SHEEP_MANA;
    }

    @Override
    public Sheep clone() {
        return new Sheep();
    }

    @Override
    public String getType() {
        return "Sheep";
    }
}
