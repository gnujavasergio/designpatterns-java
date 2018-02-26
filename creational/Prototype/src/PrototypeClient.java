
import java.util.ArrayList;

/**
 * PrototypeClient
 *
 * @author sochoa
 */
public class PrototypeClient {

    public static void main(String args[]) {
        ArrayList<BeastPrototype> beasts = new ArrayList<BeastPrototype>();
        BeastPrototypeFactory beastFactory
                = new BeastPrototypeFactory();

        for (int i = 0; i < 3; i++) {
            beasts.add(beastFactory.createBoar());
            beasts.add(beastFactory.createSheep());
            beasts.add(beastFactory.createSeal());
        }

        for (BeastPrototype beast : beasts) {
            System.out.println(beast);
        }
    }
}
