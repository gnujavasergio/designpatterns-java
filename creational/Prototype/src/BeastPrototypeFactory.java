
/**
 * BeastPrototypeFactory
 *
 * @author sochoa
 */
public class BeastPrototypeFactory {

    private Boar boar;
    private Sheep sheep;
    private Seal seal;

    public BeastPrototypeFactory() {
        boar = new Boar();
        seal = new Seal();
        sheep = new Sheep();
    }

    public Boar createBoar() {
        return boar.clone();
    }

    public Sheep createSheep() {
        return sheep.clone();
    }

    public Seal createSeal() {
        return seal.clone();
    }
}
