package virtualpetsamok;

import java.util.HashMap;

public class AnimalMap {
    private HashMap<String, SuperAnimal> petListMap = new HashMap<>();

    public void addPet(String name, SuperAnimal pet) {
        petListMap.put(name, pet);
    }

    public SuperAnimal getPet(String name) {
        return petListMap.get(name);
    }

    public SuperAnimal removePet(String name) {
        return petListMap.remove(name);
    }

    public void WalkAllOrgDogs() {
        for (SuperAnimal pet : petListMap.values()) {
            if (pet instanceof OrganicDog) {
                OrganicDog dog = (OrganicDog) pet;
                dog.walk();
            }
        }
    }

    public void CleanAllDogCages() {
        for (SuperAnimal pet : petListMap.values()) {
            if (pet instanceof OrganicDog) {
                OrganicDog dog = (OrganicDog) pet;
                dog.cleanCage();
            }
        }
    }

    public void CleanCatLitterBox() {
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

    public void printAllPets() {
        for (SuperAnimal pet : petListMap.values()) {
            System.out.println("Name: " + pet.getName());
            System.out.println("Health: " + pet.getHealth());
            System.out.println("Happiness: " + pet.getHappiness());

            if (pet instanceof OrganicCat) {
                OrganicCat orgCat = (OrganicCat) pet;
                System.out.println("Hunger: " + orgCat.getHunger());
                System.out.println("Thirst: " + orgCat.getThirst());
                System.out.println("Boredom: " + orgCat.getBoredom());

            } else if (pet instanceof OrganicDog) {
                OrganicDog orgDog = (OrganicDog) pet;
                System.out.println("Hunger: " + orgDog.getHunger());
                System.out.println("Thirst: " + orgDog.getThirst());
                System.out.println("Boredom: " + orgDog.getBoredom());

            } else if (pet instanceof RoboticCat) {
                RoboticCat roboCat = (RoboticCat) pet;
                System.out.println("Oil Level: " + roboCat.getOilLevel());
                System.out.println("Maintenance Level: " + roboCat.getMaintenance());

            } else if (pet instanceof RoboticDog) {
                RoboticDog roboDog = (RoboticDog) pet;
                System.out.println("Oil Level: " + roboDog.getOilLevel());
                System.out.println("Maintenance Level: " + roboDog.getMaintenance());

            }
        }
    }
}
