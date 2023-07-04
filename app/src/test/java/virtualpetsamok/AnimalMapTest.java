package virtualpetsamok;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AnimalMapTest {
    private AnimalMap animalMap;

    @BeforeEach
    public void setUp(){
        animalMap = new AnimalMap();
    }

    @Test
    public void testAddAndGetOrgCat(){
        OrganicCat cat = new OrganicCat("KittyKat", "vanilla fur, baby kitten");
        animalMap.addPet("KittyKat", cat);
        assertEquals(cat, animalMap.getPet("KittyKat"), "did not find the expected organic cat");
    }

        @Test
    public void testAddAndGetOrgDog(){
        OrganicDog dog = new OrganicDog("Pup", "chocolate fur, baby puppy");
        animalMap.addPet("Pup", dog);
        assertEquals(dog, animalMap.getPet("Pup"), "did not find the expected organic dog");
    }

        @Test
    public void testAddAndGetRoboticCat(){
        RoboticCat cat = new RoboticCat("RoboCat", "metallic, robo kitten");
        animalMap.addPet("RoboCat", cat);
        assertEquals(cat, animalMap.getPet("RoboCat"), "did not find the expected robotic cat");
    }

        @Test
    public void testAddAndGetRoboticDog(){
        RoboticDog dog = new RoboticDog("RoboDog", "metallic, robo pup");
        animalMap.addPet("RoboDog", dog);
        assertEquals(dog, animalMap.getPet("RoboDog"), "did not find the expected organic cat");
    }

    @Test
    public void testAdoptPet(){
        OrganicDog dog = new OrganicDog("Doggo", "the goodest boy");
        animalMap.addPet("Doggo", dog);
        SuperAnimal adoptedDog = animalMap.adoptPet("Doggo");
        assertNull(animalMap.getPet("Doggo"));
        assertEquals(dog, adoptedDog);
    }

    @Test
    public void testWalkOneDog(){
        OrganicDog dog = new OrganicDog("Biscuit", "likes eating biscuits", 50, 50, 50, 50);
        animalMap.addPet("Biscuit", dog);
        animalMap.walkOneDog("Biscuit");
        assertEquals(30, dog.getBoredom());
        assertEquals(70, dog.getCleanlinessLevel());
        assertEquals(70, dog.getHappiness());
    }

    @Test
    public void testWalkAllOrganicDogs() {
        OrganicDog dog1 = new OrganicDog("Shark", "A dog with many teeth", 40, 100, 100, 100);
        OrganicDog dog2 = new OrganicDog("Bop It", "An energetic dog", 80, 100, 100, 100);
        animalMap.addPet("Shark", dog1);
        animalMap.addPet("Bop It", dog2);
        animalMap.walkAllOrganicDogs();
        assertEquals(20, dog1.getBoredom());
        assertEquals(60, dog2.getBoredom());
    }

    @Test
    public void testCuddleOneCat() {
        OrganicCat cat = new OrganicCat("Mr. Scratchy", "Affectionately scratchy", 30, 100, 100, 100);
        animalMap.addPet("Mr. Scratchy", cat);
        animalMap.cuddleOneCat("Mr. Scratchy");
        assertEquals(10, cat.getBoredom());
    }

    @Test
    public void testCuddleAllOrganicCats() {
        OrganicCat cat1 = new OrganicCat("Slim Jim", "Lanky kitty", 50, 100, 100, 100);
        OrganicCat cat2 = new OrganicCat("Slinky", "Always on the move", 60, 100, 100, 100);
        animalMap.addPet("Slim Jim", cat1);
        animalMap.addPet("Slinky", cat2);
        animalMap.cuddleAllOrganicCats();
        assertEquals(30, cat1.getBoredom());
        assertEquals(40, cat2.getBoredom());
    }

    
}