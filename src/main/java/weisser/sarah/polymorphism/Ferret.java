package weisser.sarah.polymorphism;

/**
 * Created by sarahweisser on 5/5/17.
 */
public class Ferret extends Pet {

    public Ferret(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "I will steal all your socks.";
    }

}
