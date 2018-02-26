
/**
 * BeastPrototype
 *
 * @author sochoa
 */
public abstract class BeastPrototype {

    protected int defense;
    protected int mana;

    public abstract BeastPrototype clone();

    public abstract String getType();

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "BeastPrototype [defense=" + defense + ", mana=" + mana + ", type:" + getType() + "]";
    }

}
