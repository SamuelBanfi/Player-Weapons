/**
 * Questa classe rappresenta un RugerBlackHawk.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */
public class RugerBlackHawk extends Revolver {
    
    /**
     * Istanzia un oggetto di tipo RugerBlackHawk.
     */
    public RugerBlackHawk() {
        super(6);
    }

    /**
     * Il suono che fa mentre spara.
     */
    @Override
    protected void makeShootNoise() {
        System.out.println("BANG");
    }

    /**
     * Il suono che fa quando finiscono le munizioni.
     */
    @Override
    protected void makeOutOfAmmoNoise() {
        System.out.println("CLICK");
    }

    /**
     * Il suono che fa quando ricarica le munizioni.
     */
    @Override
    protected void makeReloadNoise() {
        System.out.println("TIN TIN TIN");
    }
}
