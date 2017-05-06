package midtermP_Starter;

import java.util.List;
import java.util.Set;

/**
 * This class must compile against your code , even if ( some of) the methods
 * are empty implementations . Whether or not it executes correctly against
 * your code is another story ....\the output of this class should look exactly like this

Human - Name: student Age: 123 owns 0 pets
Pet - Age: 123 Color: blue
printAll:
Human - Name: student Age: 123 owns 1 pets
	Pet - Age: 123 Color: blue
Pet - Age: 123 Color: blue

 * 
 */
class TestEarth {
    public static void main ( String[] args ) {
        String aString = "student";
        String aColor = "blue";
        int anInteger = 123;
        String anotherString;
        List <Pet> pets;
        List <Pet> ownedPets;
        List <Human> humans;
        List <String> names;
        List <Mammal> mammals;

        Earth earth = new Earth ();

        Human aHuman = new Human(aString ,anInteger);
        System.out.println(aHuman.toString());
        anotherString = aHuman.getName();

        Pet aPet = new Pet(aColor, anInteger);
        System.out.println(aPet.toString());

        aHuman.addPet(aPet);
        pets = aHuman.getPets();

        earth.addMammal(aHuman);
        earth.addMammal(aPet);
        earth.printAll();
        mammals = earth.getMammals();
        humans = earth.getHumans();
        ownedPets = earth.getOwnedPets();
        names = earth.getHumanNames();
    }
}