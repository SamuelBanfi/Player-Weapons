/**
 * Questa classe rappresenta un giocatore.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */
public class Dragunov extends SniperRifle {
    
    /**
     *
     */
    public Dragunov() {
        super(10);
    }

    /**
     *
     */
    @Override
    protected void makeShootNoise() {
        System.out.println("STAM");
    }

    /**
     *
     */
    @Override
    protected void makeOutOfAmmoNoise() {
        System.out.println("CLACK");
    }

    /**
     *
     */
    @Override
    protected void makeReloadNoise() {
        System.out.println("STICK STUCK STACK");        
    }
}
