package virtualpetsamok;

import java.util.HashMap;
import java.util.Map;

public class AnimalMap {
    private HashMap<String, SuperAnimal> petListMap = new HashMap<>();

    public void addPet(String name, SuperAnimal pet) {
        String correctedName = name.trim().toLowerCase();
        petListMap.put(correctedName, pet);
    }

    public SuperAnimal getPet(String name) {
        String correctedName = name.trim().toLowerCase();
        return petListMap.get(correctedName);
    }

    public SuperAnimal adoptPet(String name) {
        String correctedName = name.trim().toLowerCase();
        return petListMap.remove(correctedName);
    }

    public void walkOneDog(String name) {
        String correctedName = name.trim().toLowerCase();
        SuperAnimal pet = getPet(correctedName);
        if (pet instanceof OrganicDog) {
            OrganicDog dog = (OrganicDog) pet;
            dog.walk();
            System.out.println("Thank you for walking " + correctedName);
        } else {
            System.out.println("No organic dog by that name, please try again.");
        }
    }

    public void walkAllOrganicDogs() {
        for (SuperAnimal pet : petListMap.values()) {
            if (pet instanceof OrganicDog) {
                OrganicDog dog = (OrganicDog) pet;
                dog.walk();
            }
        }
    }

    public void cuddleOneCat(String name) {
        String correctedName = name.trim().toLowerCase();
        SuperAnimal pet = getPet(correctedName);
        if (pet instanceof OrganicCat) {
            OrganicCat cat = (OrganicCat) pet;
            cat.cuddle();
            System.out.println("Thank you for cuddling " + correctedName);
        } else {
            System.out.println("No organic cat by that name, please try again.");
        }
    }

    public void cuddleAllOrganicCats() {
        for (SuperAnimal pet : petListMap.values()) {
            if (pet instanceof OrganicCat) {
                OrganicCat cat = (OrganicCat) pet;
                cat.cuddle();
            }
        }
    }

    public void cleanAllDogCages() {
        for (SuperAnimal pet : petListMap.values()) {
            if (pet instanceof OrganicDog) {
                OrganicDog dog = (OrganicDog) pet;
                dog.cleanCage();
            }
        }
    }

    public void cleanCatLitterBox() {
        for (SuperAnimal pet : petListMap.values()) {
            if (pet instanceof OrganicCat) {
                OrganicCat cat = (OrganicCat) pet;
                cat.cleanLitterBox();
            }
        }
    }

    public void giveAllOrganicAnimalsFood() {
        for (SuperAnimal pet : petListMap.values()) {
            if (pet instanceof OrganicDog) {
                OrganicDog dog = (OrganicDog) pet;
                dog.feedOrOil();
            }
        }
        for (SuperAnimal pet : petListMap.values()) {
            if (pet instanceof OrganicCat) {
                OrganicCat cat = (OrganicCat) pet;
                cat.feedOrOil();
            }
        }
    }

    public void giveAllOrganicAnimalsWater() {
        for (SuperAnimal pet : petListMap.values()) {
            if (pet instanceof OrganicDog) {
                OrganicDog dog = (OrganicDog) pet;
                dog.drinkOrMaintenance();
                ;
            }
        }
        for (SuperAnimal pet : petListMap.values()) {
            if (pet instanceof OrganicCat) {
                OrganicCat cat = (OrganicCat) pet;
                cat.drinkOrMaintenance();
            }
        }
    }

    public void giveAllRobotsOil() {
        for (SuperAnimal pet : petListMap.values()) {
            if (pet instanceof RoboticDog) {
                RoboticDog dog = (RoboticDog) pet;
                dog.feedOrOil();
            }
        }
        for (SuperAnimal pet : petListMap.values()) {
            if (pet instanceof RoboticCat) {
                RoboticCat cat = (RoboticCat) pet;
                cat.feedOrOil();
            }
        }
    }

    public void giveAllRobotsMaintenance() {
        for (SuperAnimal pet : petListMap.values()) {
            if (pet instanceof RoboticDog) {
                RoboticDog dog = (RoboticDog) pet;
                dog.drinkOrMaintenance();
            }
        }
        for (SuperAnimal pet : petListMap.values()) {
            if (pet instanceof RoboticCat) {
                RoboticCat cat = (RoboticCat) pet;
                cat.drinkOrMaintenance();
            }
        }
    }

    public Map<String, SuperAnimal> getPetListMap() {
        return petListMap;
    }

    public void runAllTicks() {
        for (SuperAnimal pet : petListMap.values()) {
            pet.tick();
        }
    }

    public void runAllIncreaseHappiness() {
        for (SuperAnimal pet : petListMap.values()) {
            pet.increaseHappiness();
        }
    }

    public void runAllDecreaseHealth() {
        for (SuperAnimal pet : petListMap.values()) {
            pet.decreaseHealth();
        }
    }
}
