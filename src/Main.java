public class Main {
    public static void main(String[] args){
        weapon bossWeapon= new weapon("firearm","AK-47");
        Boss boss= new Boss("Злой",500,bossWeapon);
        System.out.println("Урон босса " + boss.getDamage());
        System.out.println("Здоровье босса: " + boss.getHealth());
        System.out.println("Тип оружия босса: " + boss.getWeapon().getType());
        System.out.println("Название оружия босса: " + boss.getWeapon().getName());
    }
    }
