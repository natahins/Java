
public class Shooter extends Player {

    public Shooter(String name) {
        super(name);
        this.health = 30;
        this.damage = 12;
    }



    @Override
    public String getProffession() {
        return "Shooter";
    }
}
