/**
 * Questa classe rappresenta un giocatore.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */
public class Ak47 extends AssaultRifle {
    
    /**
     *
     */
    public Ak47() {
        super(30);
    }

    /**
     *
     */
    @Override
    protected void makeShootNoise() {
        System.out.println("RAPAPA");
    }

    /**
     *
     */
    @Override
    protected void makeOutOfAmmoNoise() {
        System.out.println("CHICK CHICK");
    }

    /**
     *
     */
    @Override
    protected void makeReloadNoise() {
        System.out.println("CLICK CLACK");
    }
}
