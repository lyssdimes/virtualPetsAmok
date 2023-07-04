package virtualpetsamok;

public class RoboticCat extends SuperAnimal {

    private int maintenance;
    private int oilLevel;

    public RoboticCat(String name, String description) {
        super(name, true, description, 100, 100);
        this.maintenance = 100;
        this.oilLevel = 100;
    }

    public RoboticCat(String name, String description, int initialHealth, int initialHappiness, int initialMaintenance, int initialOilLevel) {
        super(name, true, description, 100, 100);
        this.health = initialHealth;
        this.happiness = initialHappiness;
        this.maintenance = initialMaintenance;
        this.oilLevel = initialOilLevel;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    @Override
    public void feedOrOil() {
        oilLevel = 100;
        happiness += 10;
        if (happiness >= 100) {
            happiness = 100;
        }
    }

    @Override
    public void drinkOrMaintenance() {
        maintenance = 100;
        health += 10;
        if (health >= 100) {
            health = 100;
        }
        happiness += 10;
        if (happiness >= 100) {
            happiness = 100;
        }
    }

    @Override
    public void decreaseHealth() {
        if (oilLevel <= 50 || maintenance <= 50 || happiness <= 50) {
            health -= 10;
            if (health <= 0) {
                health = 0;
            } else {
                health += 20;
            }
        }
    }

    @Override
    public void increaseHappiness() {
        if (oilLevel >= 50 && maintenance >= 50) {
            happiness += 30;
            if (happiness >= 100) {
                happiness = 100;
            }
        }
    }

    @Override
    public void tick() {
        health -= 5;
        if (health <= 0) {
            health = 0;
        }
        happiness -= 5;
        if (happiness <= 0) {
            happiness = 0;
        }
        maintenance -= 5;
        if (maintenance <= 0) {
            maintenance = 0;
        }
        oilLevel -= 5;
        if (oilLevel <= 0) {
            oilLevel = 0;
        }
    }
}
