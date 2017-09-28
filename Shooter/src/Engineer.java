

public class Engineer extends Player{
    private int shield = 30;

    public Engineer(String name) {
        super(name);
        this.health = 50;
        this.damage = 8;
    }

    @Override
    public void damage(int damage) {
        shield -=damage;
        health += shield;
        if (health <= 0)
            isAlive = false;
    }

    @Override
    public String getProffession() {
        return "Engineer";
    }

}
