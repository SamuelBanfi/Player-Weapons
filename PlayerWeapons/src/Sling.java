/**
 * Questa classe rappresenta uno sling.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */
public class Sling extends Weapon {
    
    /**
     * Istanzia un oggetto di tipo sling.
     */
    public Sling() {
        super(1);
    }
    
    /**
     * Il rumore che fa quando spara.
     */
    @Override
    protected void makeShootNoise() {
        System.out.println("FIUM");
    }
    
    /**
     * Il rumore che fa quando finiscono le munizioni.
     */
    @Override
    protected void makeOutOfAmmoNoise(){
        System.out.println("...");
    }
    
    /**
     * Il rumore che fa quando ricarica le munizioni.
     */
    protected void makeReloadNoise() {
        System.out.println("BRRR");
    }
}
