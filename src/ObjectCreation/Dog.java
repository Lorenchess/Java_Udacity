package ObjectCreation;

public class Dog extends Animal{
    private String name;

    public Dog(String name, int age, String gender) {
        super(name, age, gender);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks...");
    }
}
