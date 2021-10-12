
import java.util.ArrayList;
import java.util.List;

/**
 * Questa classe rappresenta un giocatore.
 * @author Samuel Banfi
 * @author Lorenzo Spadea
 * @version 09.10.2021
 */
public class Player {
    
    String name;

    /**
    
     */
    List<Weapon> weapons;
    
    /**
    
     */
    Weapon currentWeapon;
    
    /**
    
     */
    public Player() {
        weapons = new ArrayList<>();
        currentWeapon = null;
        this.name = "Anonymous";
    }

    public Player(String nome) {
        weapons = new ArrayList<>();
        currentWeapon = null;
        this.name = nome;
    }


    
    /**
     * Questo metodo permette di cambiare l'arma se la grandezza
     * della lista contiene delle armi. Se non è mai stata selezionata
     * un arma viene scelta la prima della lista altrimenti seleziona
     * l'arma successiva a quella attiva.
     */
    public void changeWeapon() {
        if (weapons.size() > 0) {
            int size = weapons.size();
            if (currentWeapon == null) {
                currentWeapon = weapons.get(0);
            } else {
                int index = weapons.indexOf(currentWeapon);
                if(index == size-1){
                    currentWeapon = weapons.get(0);
                }else{
                    currentWeapon = weapons.get(index + 1);
                }
            }
        } else {
            System.out.println("Add weapons to select one");
        } 
    }
    
    /**
     * Metodo che permette di aggiungere un'arma alla lista di armi.
     * @param weapon l'arma da aggiungere
     */
    public void addWeapon(Weapon weapon) {
        
        weapons.add(weapon);  
    }
    
    /**
     * Se un'arma è selezionata permette di sparare.
     */
    public void shoot() {
        
        if (currentWeapon != null) {
            currentWeapon.shoot();
        }else{
            System.out.println("No weapon selected");
        }
    }
    
    /**
     * Se un'arma è selezionata permette di ricarcarla.
     */
    public void reloadWeapon() {
        
        if (currentWeapon != null) {
            currentWeapon.reload();
        }else{
            System.out.println("No weapon selected");
        }
    }

    public final String getWeapons(){
        String weap = "";
        for(Weapon wp : weapons){
            weap += wp + "\n";
        }
        return weap;
    }

    public final String getWeapon(){
        return this.currentWeapon.toString();
    }

    public final String toString(){
        return "nome player: " + this.name ;
    }
}
