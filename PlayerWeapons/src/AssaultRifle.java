/**
 * Questa classe rappresenta un fucile d'assalto.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */
public abstract class AssaultRifle extends Weapon {
    
    /**
     * Istanzia un oggetto di tipo AssaultRifle.
     * @param ammoCapacity il numero di munizioni che tiene l'arma.
     */
    public AssaultRifle(int ammoCapacity) {
        super(ammoCapacity);
    }
}
