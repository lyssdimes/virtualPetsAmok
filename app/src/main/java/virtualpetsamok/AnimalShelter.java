package virtualpetsamok;

import java.util.Scanner;

public class AnimalShelter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        AnimalMap managePets = new AnimalMap();
        SuperAnimal cat1 = new OrganicCat("Giorno", "golden eyed, bengal cat");
        managePets.addPet(cat1.getName(), cat1);
        SuperAnimal cat2 = new OrganicCat("Fugo", "orange eyed, Maine coon cat");
        managePets.addPet(cat2.getName(), cat2);
        SuperAnimal cat3 = new RoboticCat("Bruno", "brown eyed cat, metallic coating");
        managePets.addPet(cat3.getName(), cat3);
        SuperAnimal cat4 = new RoboticCat("Mista", "blue eyed cat, red coating");
        managePets.addPet(cat4.getName(), cat4);
        SuperAnimal dog1 = new OrganicDog("Abbacchio", "silver eyed dog, purple fur");
        managePets.addPet(dog1.getName(), dog1);
        SuperAnimal dog2 = new OrganicDog("Diavolo", "violet eyed dog, black and white spots");
        managePets.addPet(dog2.getName(), dog2);
        SuperAnimal dog3 = new RoboticDog("Trish", "rainbow eyed cat, black coating");
        managePets.addPet(dog3.getName(), dog3);
        SuperAnimal dog4 = new RoboticDog("Narancia", "blue eyed cat, pink metallic coating");
        managePets.addPet(dog4.getName(), dog4);
        do {
            System.out.println("Please enter a number to make a selection:");
            System.out.println(" 1 -- Feed all organic pets");
            System.out.println(" 2 -- Give water to all organic pets");
            System.out.println(" 3 -- Walk all organic dogs");
            System.out.println(" 4 -- Cuddle all organic cats");
            System.out.println(" 5 -- Clean all dog cages");
            System.out.println(" 6 -- Clean the shelter's litter box");
            System.out.println(" 7 -- Adopt a robotic or organic animal");
            System.out.println(" 8 -- Surrender a robotic or organic animal to the shelter");
            System.out.println(" 9 -- Walk one particular organic dog");
            System.out.println("10 -- Cuddle one organic cat");
            System.out.println("11 -- Oil all robotic pets");
            System.out.println("12 -- Provide maintenance for all robotic pets");
            System.out.println("13 -- Provide a donation to help the shelter animals");
            System.out.println("14 -- Exit");
            int userInput = input.nextInt();
            input.nextLine();
            managePets.runAllTicks();
            managePets.runAllDecreaseHealth();
            if (userInput == 1) {
                System.out.println("Thank you for feeding all the organic cats & dogs!");
                managePets.giveAllOrganicAnimalsFood();
            } else if (userInput == 2) {
                System.out.println("Thank you for giving water to all the organic cats & dogs!");
                managePets.giveAllOrganicAnimalsWater();
            } else if (userInput == 3) {
                System.out.println("Thank you for walking all the organic dogs!");
                managePets.walkAllOrganicDogs();
            } else if (userInput == 4) {
                System.out.println("Thank you for cuddling all the organic cats!");
                managePets.cuddleAllOrganicCats();
            } else if (userInput == 5) {
                System.out.println("Thank you for cleaning all the organic dog cages!");
                managePets.cleanAllDogCages();
            } else if (userInput == 6) {
                System.out.println("Thank you for cleaning the organic cat litter box!");
                managePets.cleanCatLitterBox();
            } else if (userInput == 7) {
                System.out.println("Great! Please enter the name of the pet you wish to adopt");
                String adopteeName = input.nextLine();
                managePets.adoptPet(adopteeName);
                System.out.println("Please stop at the front desk to finalize the adoption of " + adopteeName);
            } else if (userInput == 8) {
                System.out.println("Please enter the name of the pet you are surrendering");
                String newPetForAdoption = input.nextLine();
                System.out.println("Enter the description of the pet:");
                String petDescription = input.nextLine();
                System.out.println("Please enter the appropriate number to indicate the pet's species:");
                System.out.println("1 -- Organic Dog, 2 -- Organic Cat, 3 -- Robotic Dog, or 4 -- Robotic Cat");
                int petType = input.nextInt();
                SuperAnimal surrenderedPet;
                if (petType == 1) {
                    surrenderedPet = new OrganicDog(newPetForAdoption, petDescription);
                } else if (petType == 2) {
                    surrenderedPet = new OrganicCat(newPetForAdoption, petDescription);
                } else if (petType == 3) {
                    surrenderedPet = new RoboticDog(newPetForAdoption, petDescription);
                } else if (petType == 4) {
                    surrenderedPet = new RoboticCat(newPetForAdoption, petDescription);
                } else {
                    System.out.println("Invalid pet type.");
                    return;
                }
                managePets.addPet(newPetForAdoption, surrenderedPet);
            } else if (userInput == 9) {
                System.out.println("Please enter the name of the organic dog you wish to walk:");
                String dogToWalk = input.nextLine();
                managePets.walkOneDog(dogToWalk);
            } else if (userInput == 10) {
                System.out.println("Please enter the name of the organic cat you wish to cuddle:");
                String catToCuddle = input.nextLine();
                managePets.cuddleOneCat(catToCuddle);
            } else if (userInput == 11) {
                System.out.println("Thank you for giving all the robotic pets oil!");
                managePets.giveAllRobotsOil();
            } else if (userInput == 12) {
                System.out.println("Thank you for providing maintenance for all robotic pets.");
                managePets.giveAllRobotsMaintenance();
            } else if (userInput == 13) {
                System.out.println("Thank you for your donation. This allows us to make the pets happier.");
                managePets.runAllIncreaseHappiness();
            } else if (userInput == 14) {
                System.out.println(
                        "Thank you for your interest. Please feel free to call if you ever want to volunteer or adopt!");
                quit = true;
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 14.");
            }
            screenDisplay(managePets);
        } while (!quit);
        input.close();
    }

public static void screenDisplay(AnimalMap managePets) {
    int maxNameLength = 20;
    int maxDescriptionLength = 40;
    int tabsForHealth = 1;
    int tabsForHappiness = 1;
    int tabsForSpecialMeasures = 2;

    System.out.print("Name" + "\t".repeat(maxNameLength / 8));
    System.out.print("Description" + "\t".repeat(maxDescriptionLength / 10));
    System.out.print("Health" + "\t".repeat(tabsForHealth));
    System.out.print("Happiness" + "\t".repeat(tabsForHappiness));
    System.out.print("Special Measures" + "\t".repeat(tabsForSpecialMeasures));
    System.out.println();

    System.out.println("-".repeat(200));

    for (SuperAnimal pet : managePets.getPetListMap().values()) {
        String petName = evenSpacing(pet.getName(), maxNameLength);
        String petDescription = evenSpacing(pet.getDescription(), maxDescriptionLength);

        System.out.print(petName + petDescription
                + pet.getHealth() + "\t"
                + pet.getHappiness() + "\t\t"
                + "Robotic: " + pet.isRobotic() + "\t");

        if (pet instanceof OrganicDog) {
            OrganicDog dog = (OrganicDog) pet;
            System.out.println("Hunger: " + dog.getHunger()
                    + "\tThirst: " + dog.getThirst()
                    + "\tBoredom: " + dog.getBoredom()
                    + "\tCleanliness: " + dog.getCleanlinessLevel());
        } else if (pet instanceof OrganicCat) {
            OrganicCat cat = (OrganicCat) pet;
            System.out.println("Hunger: " + cat.getHunger()
                    + "\tThirst: " + cat.getThirst()
                    + "\tBoredom: " + cat.getBoredom()
                    + "\tCleanliness: " + cat.getCleanlinessLevel());
        } else if (pet instanceof RoboticDog) {
            RoboticDog dog = (RoboticDog) pet;
            System.out.println("Oil Level: " + dog.getOilLevel()
                    + "\tMaintenance: " + dog.getMaintenance());
        } else if (pet instanceof RoboticCat) {
            RoboticCat cat = (RoboticCat) pet;
            System.out.println("Oil Level: " + cat.getOilLevel()
                    + "\tMaintenance: " + cat.getMaintenance());
        } else {
            System.out.println("Error compiling list. Review types.");
        }
    }

    System.out.println("-".repeat(200));
}

    public static String evenSpacing(String inputStr, int maxLength) {
    int spacing = Math.max(0, maxLength - inputStr.length());
        return inputStr + " ".repeat(spacing);
    }
}