/**
 * Questa classe rappresenta un arco.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */

public class Arch extends Weapon {
    /**
     * Istanzia un oggeto di tipo Arch.
     */
    public Arch() {
        super(50);
    }

    /**
     * Il suo dell'arco.
     */
    @Override
    protected void makeShootNoise() {
        System.out.println("STIUUUM");
    }

    /**
     * Il suono quando non hai munizioni.
     */
    @Override
    protected void makeOutOfAmmoNoise() {
        System.out.println("...");

    }

    /**
     * Il suono quando ricarichi le freccie.
     */
    @Override
    protected void makeReloadNoise() {
        System.out.println("STRRRR");
    }  
}