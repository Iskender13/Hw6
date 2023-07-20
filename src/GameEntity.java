public class GameEntity {
    int Damage;
    int health;
    public GameEntity(String name, int health) {
        this.Damage = Damage;
        this.health = health;
    }

        public int getDamage() {
        return Damage;
    }

    public int getHealth() {
        return health;
    }

    public void setDamage(int damage) {
        this.Damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
