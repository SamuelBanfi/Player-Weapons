/**
 * Questa classe rappresenta un giocatore.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */
public class RugerBlackHawk extends Revolver {
    /**
     *
     */
    public RugerBlackHawk() {
        super(6);
    }

    /**
     *
     */
    @Override
    protected void makeShootNoise() {
        System.out.println("BANG");
    }

    /**
     *
     */
    @Override
    protected void makeOutOfAmmoNoise() {
        System.out.println("CLICK");
    }

    /**
     *
     */
    @Override
    protected void makeReloadNoise() {
        System.out.println("TIN TIN TIN");
    }
}
