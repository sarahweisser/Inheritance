package weisser.sarah.polymorphism;

/**
 * Created by sarahweisser on 5/5/17.
 */
public class Ferret extends Pet {

    private String species = "ferret";

    public Ferret(String name) {
        super(name);
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String speak() {
        return "I will steal all your socks.";
    }

}
