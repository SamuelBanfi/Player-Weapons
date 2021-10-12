/**
 * Questa classe rappresenta un barret.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */
public class Barret extends SniperRifle {

    /**
     * Istanzia un oggetto di tipo barret.
     */
    public Barret() {
        super(10);
    }

    /**
     * Il suono che fa quqndo spara.
     */
    @Override
    protected void makeShootNoise() {
        System.out.println("STUM");
    }

    /**
     * Il suono che fa quando finiscono i proiettili.
     */
    @Override
    protected void makeOutOfAmmoNoise() {
        System.out.println("CHOCK CHOK");
    }

    /**
     * Il suono che fa quando ricarica
     */
    @Override
    protected void makeReloadNoise() {
        System.out.println("CLICK SCHLACK CLOCK");
    }
}
