/**
 * Questa classe rappresenta un giocatore.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */
public abstract class Weapon {
    /**
     */
    private int ammo = 0;
    
    /**

     */
    private final int AMMO_CAPACITY;
    
    /**
    
     */
    public Weapon(int ammoCapacity) {
        this.AMMO_CAPACITY = ammoCapacity;
        //this.ammo = AMMO_CAPACITY;
    }

    /**
    
     */
    protected abstract void makeShootNoise();
    
    /**
    
     */
    protected abstract void makeOutOfAmmoNoise();
    
    /**
    
     */
    protected abstract void makeReloadNoise();
    
    /**
    
     */
    public int getAmmoCapacity() {
        return AMMO_CAPACITY;
    }

    /**
    
     */
    public int getAmmo() {
        return ammo;
    }

    /**
    
     */
    public final void shoot() {
        if (getAmmo() > 0) {
            makeShootNoise();
            
            ammo -= 1;
        } else {
            makeOutOfAmmoNoise();
        }
    }
    
    /**
    
     */
    public final void reload() {
        makeReloadNoise();
        this.ammo = getAmmoCapacity();
    }
    
    /**
    
     */
    public final String toString() {
        return this.getClass().getSimpleName() + " ammo: " + ammo + " ammo capacity: " + AMMO_CAPACITY;
    }
}
