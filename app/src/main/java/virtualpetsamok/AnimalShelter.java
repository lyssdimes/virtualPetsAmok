package virtualpetsamok;

public class AnimalShelter {
    public static void main(String[] args) {
        AnimalMap managePets = new AnimalMap();
        SuperAnimal cat1 = new OrganicCat("Giorno", "golden eyes, bengal cat");
        managePets.addPet(cat1.getName(), cat1);
        SuperAnimal cat2 = new OrganicCat("Fugo", "orange eyes, Maine coon cat");
        managePets.addPet(cat2.getName(), cat2);
        SuperAnimal cat3 = new RoboticCat("Bruno", "brown eyed cat, metallic coating");
        managePets.addPet(cat3.getName(), cat3);
        SuperAnimal cat4 = new RoboticCat("Mista", "blue eyed cat, red coating");
        managePets.addPet(cat4.getName(), cat4);
        SuperAnimal dog1 = new OrganicDog("Abbacchio", "silver eyed dog, purple fur");
        managePets.addPet(dog1.getName(), dog1);
        SuperAnimal dog2 = new OrganicDog("Diavolo", "violet eyes, black and white spots");
        managePets.addPet(dog2.getName(), dog2);
        SuperAnimal dog3 = new RoboticDog("Trish", "rainbow eyed cat, black coating");
        managePets.addPet(dog3.getName(), dog3);
        SuperAnimal dog4 = new RoboticDog("Narancia", "blue eyed cat, pink metallic coating");
        managePets.addPet(dog4.getName(), dog4);
    }
}
