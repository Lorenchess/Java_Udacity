package ObjectCreation;

public class Cat extends Animal{
    private String name;

    public Cat(String name, int age, String gender ) {
        super(name, age, gender);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says miaou...");
    }
}
