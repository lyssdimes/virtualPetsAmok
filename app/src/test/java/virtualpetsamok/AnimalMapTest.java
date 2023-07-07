package virtualpetsamok;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AnimalMapTest {
    private AnimalMap animalMap;

    @BeforeEach
    public void setUp() {
        animalMap = new AnimalMap();
    }

    @Test
    public void testAddAndGetOrgCat() {
        OrganicCat cat = new OrganicCat("KittyKat", "vanilla fur, baby kitten");
        animalMap.addPet("KittyKat", cat);
        assertEquals(cat, animalMap.getPet("KittyKat"), "did not find the expected organic cat");
    }

    @Test
    public void testAddAndGetOrgDog() {
        OrganicDog dog = new OrganicDog("Pup", "chocolate fur, baby puppy");
        animalMap.addPet("Pup", dog);
        assertEquals(dog, animalMap.getPet("Pup"), "did not find the expected organic dog");
    }

    @Test
    public void testAddAndGetRoboticCat() {
        RoboticCat cat = new RoboticCat("RoboCat", "metallic, robo kitten");
        animalMap.addPet("RoboCat", cat);
        assertEquals(cat, animalMap.getPet("RoboCat"), "did not find the expected robotic cat");
    }

    @Test
    public void testAddAndGetRoboticDog() {
        RoboticDog dog = new RoboticDog("RoboDog", "metallic, robo pup");
        animalMap.addPet("RoboDog", dog);
        assertEquals(dog, animalMap.getPet("RoboDog"), "did not find the expected organic cat");
    }

    @Test
    public void testAdoptPet() {
        OrganicDog dog = new OrganicDog("Doggo", "the goodest boy");
        animalMap.addPet("Doggo", dog);
        SuperAnimal adoptedDog = animalMap.adoptPet("Doggo");
        assertNull(animalMap.getPet("Doggo"));
        assertEquals(dog, adoptedDog);
    }

    @Test
    public void testWalkOneDog() {
        OrganicDog dog = new OrganicDog("Biscuit", "likes eating biscuits", 50, 50, 50, 50, 40, 30);
        animalMap.addPet("Biscuit", dog);
        animalMap.walkOneDog("Biscuit");
        assertEquals(30, dog.getBoredom());
        assertEquals(70, dog.getCleanlinessLevel());
        assertEquals(70, dog.getHappiness());
    }

    @Test
    public void testWalkAllOrganicDogs() {
        OrganicDog dog1 = new OrganicDog("Shark", "a dog with many teeth", 40, 100, 100, 100, 30, 30);
        OrganicDog dog2 = new OrganicDog("Bop It", "an energetic dog", 80, 100, 100, 100, 20, 20);
        animalMap.addPet("Shark", dog1);
        animalMap.addPet("Bop It", dog2);
        animalMap.walkAllOrganicDogs();
        assertEquals(20, dog1.getBoredom());
        assertEquals(60, dog2.getBoredom());
    }

    @Test
    public void testCuddleOneCat() {
        OrganicCat cat = new OrganicCat("Mr. Scratchy", "affectionately scratchy", 30, 100, 100, 100, 90, 80);
        animalMap.addPet("Mr. Scratchy", cat);
        animalMap.cuddleOneCat("Mr. Scratchy");
        assertEquals(10, cat.getBoredom());
    }

    @Test
    public void testCuddleAllOrganicCats() {
        OrganicCat cat1 = new OrganicCat("Slim Jim", "lanky kitty", 50, 100, 100, 100, 20, 10);
        OrganicCat cat2 = new OrganicCat("Slinky", "always on the move", 60, 100, 100, 100, 30, 0);
        animalMap.addPet("Slim Jim", cat1);
        animalMap.addPet("Slinky", cat2);
        animalMap.cuddleAllOrganicCats();
        assertEquals(30, cat1.getBoredom());
        assertEquals(40, cat2.getBoredom());
    }

    @Test
    public void testCleanAllDogCages() {
        OrganicDog dog1 = new OrganicDog("Lilac", "likes flowers", 80, 50, 50, 80, 20, 10);
        OrganicDog dog2 = new OrganicDog("Lily", "pretty like a lily", 80, 60, 60, 80, 30, 20);
        animalMap.addPet("Lilac", dog1);
        animalMap.addPet("Lily", dog2);
        animalMap.cleanAllDogCages();
        assertEquals(100, dog1.getCleanlinessLevel());
        assertEquals(60, dog1.getHealth());
        assertEquals(100, dog2.getCleanlinessLevel());
        assertEquals(70, dog2.getHealth());
    }

    @Test
    public void testCleanCatLitterBox() {
        OrganicCat cat1 = new OrganicCat("Toothless", "kitty missing front tooth", 70, 60, 50, 40, 10, 20);
        OrganicCat cat2 = new OrganicCat("Mini", "a smol lil cat", 80, 60, 70, 90, 20, 10);
        animalMap.addPet("Toothless", cat1);
        animalMap.addPet("Mini", cat2);
        animalMap.cleanCatLitterBox();
        assertEquals(100, cat1.getCleanlinessLevel());
        assertEquals(70, cat1.getHealth());
        assertEquals(100, cat2.getCleanlinessLevel());
        assertEquals(90, cat2.getHealth());
    }

    @Test
    public void testGiveAllOrganicAnimalsFood() {
        OrganicDog dog1 = new OrganicDog("Shadow", "hides in the shadows", 50, 80, 80, 70, 60, 30);
        OrganicCat cat1 = new OrganicCat("Mellow", "a mellow friend", 70, 90, 50, 60, 40, 20);
        animalMap.addPet("Shadow", dog1);
        animalMap.addPet("Mellow", cat1);
        animalMap.giveAllOrganicAnimalsFood();
        assertEquals(40, dog1.getHunger());
        assertEquals(100, dog1.getHealth());
        assertEquals(90, dog1.getHappiness());
        assertEquals(20, cat1.getHunger());
        assertEquals(70, cat1.getHealth());
        assertEquals(80, cat1.getHappiness());
    }

    @Test
    public void testGiveAllOrganicAnimalsWater() {
        OrganicDog dog1 = new OrganicDog("Chalk", "scared of chalk", 50, 80, 20, 30, 40, 50);
        OrganicCat cat1 = new OrganicCat("Tom", "looks like a Tom", 70, 80, 40, 60, 30, 20);
        animalMap.addPet("Chalk", dog1);
        animalMap.addPet("Tom", cat1);
        animalMap.giveAllOrganicAnimalsWater();
        assertEquals(30, dog1.getThirst());
        assertEquals(40, dog1.getHealth());
        assertEquals(50, dog1.getHappiness());
        assertEquals(0, cat1.getThirst());
        assertEquals(60, cat1.getHealth());
        assertEquals(80, cat1.getHappiness());
    }

    @Test
    public void testGiveAllRobotsOil() {
        RoboticDog dog1 = new RoboticDog("Cyborg", "wears sunglasses", 80, 40, 30, 10);
        RoboticCat cat1 = new RoboticCat("Roo", "like music", 90, 30, 40, 20);
        animalMap.addPet("Cyborg", dog1);
        animalMap.addPet("Roo", cat1);
        animalMap.giveAllRobotsOil();
        assertEquals(100, dog1.getOilLevel());
        assertEquals(60, dog1.getHappiness());
        assertEquals(100, cat1.getOilLevel());
        assertEquals(50, cat1.getHappiness());
    }

    @Test
    public void testGiveAllRobotsMaintenance() {
        RoboticDog dog1 = new RoboticDog("Coconut", "likes tropical fruits", 80, 50, 40, 30);
        RoboticCat cat1 = new RoboticCat("Hot Rod", "likes to party", 30, 80, 70, 60);
        animalMap.addPet("Coconut", dog1);
        animalMap.addPet("Hot Rod", cat1);
        animalMap.giveAllRobotsMaintenance();
        assertEquals(100, dog1.getMaintenance());
        assertEquals(70, dog1.getHappiness());
        assertEquals(100, dog1.getHealth());
        assertEquals(100, cat1.getMaintenance());
        assertEquals(100, cat1.getHappiness());
        assertEquals(50, cat1.getHealth());
    }

    @Test
    public void testRunAllTicks() {
        OrganicDog dog1 = new OrganicDog("Cinnamon", "pretty fur", 50, 60, 70, 80, 40, 10);
        OrganicCat cat1 = new OrganicCat("Chaos", "lots of attitude", 45, 80, 70, 40, 20, 10);
        RoboticDog robo1 = new RoboticDog("Charles", "smart robo dog", 40, 60, 70, 80);
        RoboticCat robo2 = new RoboticCat("Rainbow", "wild and free", 60, 90, 95, 70);
        animalMap.addPet("Cinnamon", dog1);
        animalMap.addPet("Chaos", cat1);
        animalMap.addPet("Charles", robo1);
        animalMap.addPet("Rainbow", robo2);
        animalMap.runAllTicks();
        assertEquals(65, dog1.getHealth());
        assertEquals(45, dog1.getHunger());
        assertEquals(75, dog1.getHappiness());
        assertEquals(15, dog1.getThirst());
        assertEquals(55, dog1.getBoredom());
        assertEquals(55, dog1.getCleanlinessLevel());
        assertEquals(65, cat1.getHealth());
        assertEquals(25, cat1.getHunger());
        assertEquals(35, cat1.getHappiness());
        assertEquals(15, cat1.getThirst());
        assertEquals(50, cat1.getBoredom());
        assertEquals(75, cat1.getCleanlinessLevel());
        assertEquals(35, robo1.getHealth());
        assertEquals(55, robo1.getHappiness());
        assertEquals(65, robo1.getMaintenance());
        assertEquals(75, robo1.getOilLevel());
        assertEquals(55, robo2.getHealth());
        assertEquals(85, robo2.getHappiness());
        assertEquals(90, robo2.getMaintenance());
        assertEquals(65, robo2.getOilLevel());
    }

    @Test
    public void testRunAllIncreaseHappiness() {
        OrganicDog dog1 = new OrganicDog("Cinnamon", "pretty fur", 40, 60, 70, 70, 40, 10);
        OrganicCat cat1 = new OrganicCat("Chaos", "lots of attitude", 80, 80, 70, 40, 80, 10);
        RoboticDog robo1 = new RoboticDog("Charles", "smart robo dog", 30, 30, 30, 80);
        RoboticCat robo2 = new RoboticCat("Rainbow", "wild and free", 60, 60, 95, 70);
        animalMap.addPet("Cinnamon", dog1);
        animalMap.addPet("Chaos", cat1);
        animalMap.addPet("Charles", robo1);
        animalMap.addPet("Rainbow", robo2);
        animalMap.runAllIncreaseHappiness();
        assertEquals(100, dog1.getHappiness());
        assertEquals(40, cat1.getHappiness());
        assertEquals(30, robo1.getHappiness());
        assertEquals(90, robo2.getHappiness());
    }

    @Test
    public void testRunAllDecreaseHealth() {
        OrganicDog dog1 = new OrganicDog("Cinnamon", "pretty fur", 60, 60, 70, 80, 40, 10);
        OrganicCat cat1 = new OrganicCat("Chaos", "lots of attitude", 40, 80, 70, 90, 20, 10);
        RoboticDog robo1 = new RoboticDog("CJ", "smart robo dog", 40, 60, 30, 20);
        RoboticCat robo2 = new RoboticCat("Rainbow", "wild and free", 60, 90, 95, 70);
        animalMap.addPet("Cinnamon", dog1);
        animalMap.addPet("Chaos", cat1);
        animalMap.addPet("CJ", robo1);
        animalMap.addPet("Rainbow", robo2);
        animalMap.runAllDecreaseHealth();
        assertEquals(60, dog1.getHealth());
        assertEquals(70, cat1.getHealth());
        assertEquals(30, robo1.getHealth());
        assertEquals(80, robo2.getHealth());
    }
}
