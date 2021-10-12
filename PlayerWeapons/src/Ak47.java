/**
 * Questa classe rappresenta un mitra ak47.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */
public class Ak47 extends AssaultRifle {
    
    /**
     * Istanzia un oggetto di tipo Ak47.
     */
    public Ak47() {
        super(30);
    }

    /**
     * Il suono dell' Ak47.
     */
    @Override
    protected void makeShootNoise() {
        System.out.println("RAPAPA");
    }

    /**
     * Il suono dello sparo.
     */
    @Override
    protected void makeOutOfAmmoNoise() {
        System.out.println("CHICK CHICK");
    }

    /**
     * Il suono che fa mentre si ricarica.
     */
    @Override
    protected void makeReloadNoise() {
        System.out.println("CLICK CLACK");
    }
}
