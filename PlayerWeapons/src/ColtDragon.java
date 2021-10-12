/**
 * Questa classe rappresenta un revolver.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */
public class ColtDragon extends Revolver {
    
    /**
     *Istanzia un oggetto di tipo ColtDragon.
     */
    public ColtDragon() {
        super(6);
    }

    /**
     * Il rumore che fa quando spara.
     */
    @Override
    protected void makeShootNoise() {
        System.out.println("BANG");
    }

    /**
     * Il rumore che fa quando finiscono le munizioni.
     */
    @Override
    protected void makeOutOfAmmoNoise() {
        System.out.println("CLICK");
    }

    /**
     * Il rumore di ricarica delle munizioni.
     */
    @Override
    protected void makeReloadNoise() {
        System.out.println("TIN TIN TIN");
    }
}
