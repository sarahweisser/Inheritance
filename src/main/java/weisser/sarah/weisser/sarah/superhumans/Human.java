package weisser.sarah.weisser.sarah.superhumans;

/**
 * Created by sarahweisser on 5/1/17.
 */
public class Human {

    private String name;
    private int age;
    private String gender;
    private String occupation;
    private String address;

    public Human(String name, int age, String gender, String occupation, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public String getOccupation() {
        return occupation;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void printFields() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Occupation: " + occupation);
        System.out.println("Address: " + address);
    }

    public void printName() {
        System.out.println("Name: " + name);
    }

}
