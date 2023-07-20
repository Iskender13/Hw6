public class Boss extends GameEntity{
    private weapon weapon;

    // Конструктор класса Boss
    public Boss(String name, int health, weapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    // Геттер и сеттер для поля weapon
    public weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(weapon weapon) {
        this.weapon = weapon;
    }

}


