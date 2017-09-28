
public abstract class Player {
    private String name;
    protected int health;
    protected int damage;
    protected boolean isAlive;
    public Player(String name) {
        this.name = name;
        isAlive = true;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return isAlive;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void damage(int damage) {
        health -=damage;
        if (getHealth() <= 0)
            isAlive = false;
    }

    public abstract String getProffession();


    public void fight(Player enemy) {
        System.out.println(this.getName() + " ("+ this.getProffession() +  ") fights " + enemy.getName() + " ("+ enemy.getProffession() + ") with " + damage + " damage");
        enemy.damage(damage);
    }


    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

}
