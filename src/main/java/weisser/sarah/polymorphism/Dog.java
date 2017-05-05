package weisser.sarah.polymorphism;

/**
 * Created by sarahweisser on 5/5/17.
 */
public class Dog extends Pet {

    private String species = "dog";

    public Dog(String name) {
        super(name);
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String speak() {
        return "I'm man's best friend.";
    }


}
