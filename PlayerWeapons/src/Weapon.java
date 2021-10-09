/**
 * Questa classe rappresenta un giocatore.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */
public abstract class Weapon {
    
    private int ammo = 0;
    
    private final int AMMO_CAPACITY;
    
    public Weapon(int ammoCapacity) {
        
        AMMO_CAPACITY = ammoCapacity;
    }
    
    protected abstract void makeShootNoise();
    
    protected abstract void makeOutOfAmmoNoise();
    
    protected abstract void makeReloadNoise();
    
    public final void shoot() {
        
        if (getAmmo() > 0) {
            makeShootNoise();
            
            ammo -= 1;
        } else {
            makeOutOfAmmoNoise();
            
            System.out.println("You have to reload");
        }
    }
    
    public final void reload() {
        
        System.out.println("RELOADING...");
        
        makeReloadNoise();
        
        ammo = AMMO_CAPACITY;
    }
    
    public final String toString() {
        
        return "ammo: " + ammo + " ammo capacity: " + AMMO_CAPACITY;
    }
    
    public int getAmmoCapacity() {
        
        return AMMO_CAPACITY;
    }
    
    public int getAmmo() {
        
        return ammo;
    }
}
