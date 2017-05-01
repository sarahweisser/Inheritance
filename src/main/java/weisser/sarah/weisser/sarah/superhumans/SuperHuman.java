package weisser.sarah.weisser.sarah.superhumans;

/**
 * Created by sarahweisser on 5/1/17.
 */
public class SuperHuman extends Human {

    private String category;
    private String heroName;
    private String superAbility;

    public SuperHuman(String name, int age, String gender, String occupation, String address, String category, String heroName, String superAbility) {

        super(name, age, gender, occupation, address);
        this.category = category;
        this.heroName = heroName;
        this.superAbility = superAbility;

    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
    public String getHeroName() {
        return heroName;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }
    public String getSuperAbility() {
        return superAbility;
    }

    @Override
    public void printFields() {
        super.printFields();
        System.out.println("Category: " + category);
        System.out.println("Hero Name: " + heroName);
        System.out.println("Super Ability: " + superAbility);
    }
}

