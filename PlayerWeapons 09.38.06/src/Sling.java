/**
 * Questa classe rappresenta un giocatore.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */
public class Sling extends Weapon {
    
    public Sling() {
        
        super(1);
    }
    
    @Override
    protected void makeShootNoise() {
        
        System.out.println("FIUM");
    }
    
    @Override
    protected void makeOutOfAmmoNoise(){
        
        System.out.println("...");
    }
    
    @Override
    protected void makeReloadNoise() {
        
        System.out.println("BRRR");
    }
}
