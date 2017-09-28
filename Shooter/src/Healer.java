

public class Healer extends Player {
    private int healPower = 3;

    public Healer(String name) {
        super(name);
        this.damage = 5;
        this.health  =25;
    }

    @Override
    public void damage(int damage) {
        this.health -= damage;
        if (getHealth() <= 0)
            isAlive = false;
        heal();
    }

    private void heal() {
        this.health +=healPower;
        System.out.println(this.getName() + " regenerated " + healPower + "HP");
    }

    public String getProffession() {
        return "Healer";
    }

}
