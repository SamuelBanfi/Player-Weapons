/**
 * Questa classe rappresenta un mitra Arx160.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */
public class Arx160 extends AssaultRifle {
    
    /**
     * Istanzia un oggetto di tipo Arx160.
     */
    public Arx160() {
        super(30);
    }

    /**
     * Il suono di quando spara.
     */
    @Override
    protected void makeShootNoise() {
        System.out.println("TA TA TA");
    }

    /**
     * Il suono di quando finiscono le munizioni.
     */
    @Override
    protected void makeOutOfAmmoNoise() {
        System.out.println("CLICK CLICK");

    }

    /**
     * Il suono di ricarica delle munizioni.
     */
    @Override
    protected void makeReloadNoise() {
        System.out.println("CLICK CLACK");
    }  
}
