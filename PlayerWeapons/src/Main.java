public class Main {
    public static void main(String[] args){
        Player banfi = new Player("banfi");
        System.out.println(banfi);
        banfi.addWeapon(new RugerBlackHawk());
        banfi.addWeapon(new Sling());
        System.out.println(banfi.getWeapons());
    } 
}