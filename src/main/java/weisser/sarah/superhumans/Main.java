package weisser.sarah.superhumans;

/**
 * Created by sarahweisser on 5/1/17.
 */
public class Main {

    public static void main(String[] args) {

        Human joe = new Human("Joe", 33, "M", "Software Developer", "Arden");
        joe.printFields();
        Human sarah = new Human("Sarah", 35, "F", "Bum", "Amidst the frathouses");
        sarah.printFields();

        SuperHuman aaron = new SuperHuman("Aaron", 23, "M", "Zipcoder", "1105 North Market Street", "evil", "The Blooming Onion", "Poisonous Sulfur Gas");
        aaron.printFields();
        aaron.printName();
        SuperHuman froilan = new SuperHuman("Froilan", 30, "M", "Instructor", "Lego House", "evil", "Saint Valentine", "Eating the hearts of his enemies");
        froilan.printFields();
        froilan.printName();

    }
}
