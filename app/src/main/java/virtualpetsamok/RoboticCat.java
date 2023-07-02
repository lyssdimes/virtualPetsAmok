package virtualpetsamok;

public class RoboticCat extends SuperAnimal {

    private int maintenance;
    private int oilLevel;

    public RoboticCat(String name, String description) {
        super(name, true, description, 100, 100);
        this.maintenance = 90;
        this.oilLevel = 100;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    @Override
    public void feedOrOil() {
        oilLevel += 10;
        if (oilLevel >= 100) {
            oilLevel = 100;
        }
        happiness += 10;
        if (happiness >= 100) {
            happiness = 100;
        }
    }

    @Override
    public void drinkOrMaintenance() {
        maintenance += 10;
        if (maintenance >= 100) {
            maintenance = 100;
        }
        health += 10;
        happiness += 10;
    }

    @Override
    public void decreaseHealth() {
        if (oilLevel <= 50 || maintenance <= 50 || happiness <= 50) {
            health -= 10;
            if (health <= 0) {
                health = 0;
            }
            System.out.println("Robotic pet health is decreasing. Please provide oil and maintain them.");
        }
    }

    @Override
    public void increaseHappiness() {
        if (oilLevel >= 50 && maintenance >= 50) {
            happiness += 10;
            if (happiness >= 100) {
                happiness = 100;
            }
        } else {
            System.out.println("The robotic pets are not happy. Please provide oil and maintain them.");
        }
    }

    @Override
    public void tick() {
        health -= 5;
        happiness -= 5;
        maintenance -= 5;
        oilLevel -= 5;
    }
}
