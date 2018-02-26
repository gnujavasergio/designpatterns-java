
/**
 * Seal
 *
 * @author sochoa
 */
public class Seal extends BeastPrototype {

    private static final int SEAL_DEFENSE = 5;
    private static final int SEAL_MANA = 5;

    public Seal() {
        defense = SEAL_DEFENSE;
        mana = SEAL_MANA;
    }

    @Override
    public Seal clone() {
        return new Seal();
    }

    @Override
    public String getType() {
        return "Seal";
    }
}
