package inheritanceExample;

public class PersonTester {
    public static void main(String[] args) {
        Person ramon = new Person("Ramon", "Lorente");
        System.out.println(ramon);
        Student mike = new Student("Michael", "Lorente","12345");
        System.out.println(mike);
        StudentEmployee oniel = new StudentEmployee("Oniel","Sanchez","67890",25.40,"2839456");
        System.out.println(oniel);

    }
}
