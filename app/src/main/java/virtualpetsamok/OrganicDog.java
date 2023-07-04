package virtualpetsamok;

public class OrganicDog extends SuperAnimal {
    private int boredom = 0;
    private int cleanlinessLevel = 100;
    private int hunger = 0;
    private int thirst = 0;

    public OrganicDog(String name, String description) {
        super(name, false, description, 100, 100);
        this.boredom = 0;
        this.cleanlinessLevel = 100;
    }

    public OrganicDog(String name, String description, int initialBoredom, int initialCleanliness, int initialHealth, int initialHappiness) {
        super(name, false, description, 100, 100);
        this.boredom = initialBoredom;
        this.cleanlinessLevel = initialCleanliness;
        this.health = initialHealth;
        this.happiness = initialHappiness;
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

    public void walk() {
        boredom -= 20;
        if (boredom <= 0) {
            boredom = 0;
        }
        happiness += 20;
        if (happiness >= 100) {
            happiness = 100;
        }
        cleanlinessLevel += 20;
        if (cleanlinessLevel >= 100) {
            cleanlinessLevel = 100;
        }
    }

    public void cleanCage() {
        cleanlinessLevel = 100;

        health += 10;
        if (health >= 100) {
            health = 100;
        }
    }

    @Override
    public void feedOrOil() {
        hunger -= 20;
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
        thirst -= 20;
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
        }
    }

    @Override
    public void increaseHappiness() {
        if (cleanlinessLevel >= 50 && hunger <= 50 && thirst <= 50 && boredom <= 50) {
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
        cleanlinessLevel -= 5;
        if (cleanlinessLevel <= 0) {
            cleanlinessLevel = 0;
        }
        thirst += 5;
        if (thirst <= 0) {
            thirst = 0;
        }
        hunger += 5;
        if (hunger <= 0) {
            hunger = 0;
        }
        boredom += 5;
        if (boredom >= 100) {
            boredom = 100;
        }
    }

}
