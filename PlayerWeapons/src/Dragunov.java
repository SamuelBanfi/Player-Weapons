/**
 * Questa classe rappresenta uno Sniper rifle.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */
public class Dragunov extends SniperRifle {
    
    /**
     * Istanzia un oggetto di tipo Dragunov.
     */
    public Dragunov() {
        super(10);
    }

    /**
     * Il rumore che fa quando spara.
     */
    @Override
    protected void makeShootNoise() {
        System.out.println("STAM");
    }

    /**
     * Il rumore che fa quando finiscono le munizioni.
     */
    @Override
    protected void makeOutOfAmmoNoise() {
        System.out.println("CLACK");
    }

    /**
     * Il rumore che fa quando ricarica le munizioni.
     */
    @Override
    protected void makeReloadNoise() {
        System.out.println("STICK STUCK STACK");        
    }
}
