/**
 * Questa classe rappresenta un Weapon.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */
public abstract class Weapon {
    /**
     * Le munizioni iniziali.
     */
    private int ammo = 0;
    
    /**
     * Quante munizioni può tenere l'arma.
     */
    private final int AMMO_CAPACITY;
    
    /**
     * Istanzia un oggetto di tipo Weapon.
     * @param ammoCapacity il numero di munizioni massime dell'arma.
     */
    public Weapon(int ammoCapacity) {
        this.AMMO_CAPACITY = ammoCapacity;
        //this.ammo = AMMO_CAPACITY;
    }

    /**
     * Il rumore che fa l'arma.
     */
    protected abstract void makeShootNoise();
    
    /**
     * Il rumore che fa quando finiscono le munizioni.
     */
    protected abstract void makeOutOfAmmoNoise();
    
    /**
     * Il rumoer che fa quando vengono ricaricate le munizioni.
     */
    protected abstract void makeReloadNoise();
    
    /**
     * @return La quantità di munizioni massime dell'arma.
     */
    public int getAmmoCapacity() {
        return AMMO_CAPACITY;
    }

    /**
     * @return il numero di munizioni presenti nell'arma.
     */
    public int getAmmo() {
        return ammo;
    }

    /**
     * fa sparare l'arma.
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
     * Ricarica l'arma.
     */
    public final void reload() {
        makeReloadNoise();
        this.ammo = getAmmoCapacity();
    }
    
    /**
     * @return lo stato degli attributi dell'arma.
     */
    public final String toString() {
        return this.getClass().getSimpleName() + " ammo: " + ammo + " ammo capacity: " + AMMO_CAPACITY;
    }
}
