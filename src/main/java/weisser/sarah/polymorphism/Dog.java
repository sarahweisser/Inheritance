package weisser.sarah.polymorphism;

/**
 * Created by sarahweisser on 5/5/17.
 */
public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "I'm man's best friend.";
    }


}
