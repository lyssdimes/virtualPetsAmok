package virtualpetsamok;

public abstract class SuperAnimal implements Animals{
    protected String name;
    protected boolean robotic;
    protected String description;
    protected int health;
    protected int happiness;

    public SuperAnimal(String name, boolean robotic, String description, int health, int happiness) {
        this.name = name;
        this.robotic = robotic;
        this.description = description;
        this.health = health;
        this.happiness = happiness;
    }

    public String getName() {
        return name;
    }

    public boolean isRobotic() {
        return robotic;
    }

    public String getDescription() {
        return description;
    }

    public int getHealth() {
        return health;
    }

    public int getHappiness() {
        return happiness;
    }

    public abstract void feedOrOil();

    public abstract void drinkOrMaintenance();

    public abstract void decreaseHealth();

    public abstract void increaseHappiness();

    public abstract void tick();
}
