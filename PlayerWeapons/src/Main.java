public class Main {
    public static void main(String[] args){
        Player banfi = new Player("banfi");
        System.out.println(banfi);
        banfi.addWeapon(new RugerBlackHawk());
        banfi.addWeapon(new Sling());
        //System.out.println(banfi.getWeapons());
        
        /**
         * shooting        
         */
        banfi.shoot();
        banfi.changeWeapon();
        banfi.shoot();
        banfi.reloadWeapon();
        //ammos lose 1
        System.out.println(banfi.getWeapon());
        banfi.shoot();
        System.out.println(banfi.getWeapon());
        //outrun ammos
        int ammos = banfi.currentWeapon.getAmmo();
        while(ammos >= 0 ){
            banfi.shoot();
            ammos--;
        }

        //changing weapon
        banfi.changeWeapon();
        System.out.println(banfi.getWeapon());
        banfi.reloadWeapon();

        banfi.shoot();
        banfi.shoot();
        banfi.reloadWeapon();
        //ammos lose 1
        System.out.println(banfi.getWeapon());
        banfi.shoot();
        System.out.println(banfi.getWeapon());
        //outrun ammos
        ammos = banfi.currentWeapon.getAmmo();
        while(ammos >= 0 ){
            banfi.shoot();
            ammos--;
        }
        System.out.println(banfi.getWeapon());
        banfi.reloadWeapon();
    } 
}