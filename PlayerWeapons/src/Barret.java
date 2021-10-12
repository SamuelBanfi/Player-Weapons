/**
 * Questa classe rappresenta un giocatore.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */
public class Barret extends SniperRifle {

    /**
     *
     */
    public Barret() {
        super(10);
    }

    /**
     *
     */
    @Override
    protected void makeShootNoise() {
        System.out.println("STUM");
    }

    /**
     *
     */
    @Override
    protected void makeOutOfAmmoNoise() {
        System.out.println("CHOCK CHOK");
    }

    /**
     *
     */
    @Override
    protected void makeReloadNoise() {
        System.out.println("CLICK SCHLACK CLOCK");
    }
}
