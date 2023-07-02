package virtualpetsamok;

public class OrganicCat extends SuperAnimal {

    private int boredom = 0;
    private int cleanlinessLevel = 100;
    private int hunger = 0;
    private int thirst = 0;

    public OrganicCat(String name, String description) {
        super(name, false, description, 100, 100);
        this.boredom = 0;
        this.cleanlinessLevel = 100;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void cuddle() {
        boredom -= 10;
        if (boredom <= 0) {
            boredom = 0;
        }
        happiness += 10;
        if (happiness >= 100) {
            happiness = 100;
        }
    }

    public void cleanLitterBox() {
        cleanlinessLevel += 10;
        if (cleanlinessLevel >= 100) {
            cleanlinessLevel = 100;
        }
        health += 10;
        if (health >= 100) {
            health = 100;
        }
    }

    @Override
    public void feedOrOil() {
        hunger -= 10;
        if (hunger <= 0) {
            hunger = 0;
        }
        health += 5;
        if (health >= 100) {
            health = 100;
        }
        happiness += 5;
        if (happiness >= 100) {
            happiness = 100;
        }
    }

    @Override
    public void drinkOrMaintenance() {
        thirst -= 10;
        if (thirst <= 0) {
            thirst = 0;
        }
        health += 5;
        if (health >= 100) {
            health = 100;
        }
        happiness += 5;
        if (happiness >= 100) {
            happiness = 100;
        }
    }

    @Override
    public void decreaseHealth() {
        if (cleanlinessLevel <= 50 || hunger >= 50 || thirst >= 50 || boredom >= 50) {
            health -= 10;
            if (health <= 0) {
                health = 0;
            }
            System.out.println("You are not meeting the pets needs.");
        }
    }

    @Override
    public void increaseHappiness() {
        if (cleanlinessLevel >= 50 && hunger <= 50 && thirst <= 50 && boredom <= 50) {
            happiness += 10;
            if (happiness >= 100) {
                happiness = 100;
            }
        } else {
            System.out.println("The pets are not happy.");
        }
    }

    @Override
    public void tick() {
        health -= 5;
        happiness -= 5;
        cleanlinessLevel -= 5;
        thirst += 5;
        hunger += 5;
        boredom += 5;
    }

}
