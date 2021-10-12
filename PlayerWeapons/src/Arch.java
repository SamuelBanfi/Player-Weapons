/**
 * Questa classe rappresenta un arco.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */

public class Arch extends Weapon {
    /**
    
     */
    public Arch() {
        super(50);
    }

    /**
    
     */
    @Override
    protected void makeShootNoise() {
        System.out.println("STIUUUM");
    }

    /**
    
     */
    @Override
    protected void makeOutOfAmmoNoise() {
        System.out.println("...");

    }

    /**
    
     */
    @Override
    protected void makeReloadNoise() {
        System.out.println("STRRRR");
    }  
}