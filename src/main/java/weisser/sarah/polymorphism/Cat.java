package weisser.sarah.polymorphism;

/**
 * Created by sarahweisser on 5/5/17.
 */
public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "I make people sneeze, but they like me because I am pretty.";
    }

}
