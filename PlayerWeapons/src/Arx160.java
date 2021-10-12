/**
 * Questa classe rappresenta un giocatore.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */
public class Arx160 extends AssaultRifle {
    
    /**
    
     */
    public Arx160() {
        
        super(30);
    }

    /**
    
     */
    @Override
    protected void makeShootNoise() {
        System.out.println("TA TA TA");
    }

    /**
    
     */
    @Override
    protected void makeOutOfAmmoNoise() {
        System.out.println("CLICK CLICK");

    }

    /**
    
     */
    @Override
    protected void makeReloadNoise() {
        System.out.println("CLICK CLACK");
    }  
}
