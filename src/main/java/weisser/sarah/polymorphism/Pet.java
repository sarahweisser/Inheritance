package weisser.sarah.polymorphism;

/**
 * Created by sarahweisser on 5/5/17.
 */
public class Pet {

    protected String name;

    public Pet() {}

    public Pet(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String speak() {
        return "Speak";
    }
}
