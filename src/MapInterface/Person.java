package MapInterface;

import java.util.regex.Pattern;

public class Person {
    private String name;
    private String email;
    private final String emailRegex = "^(.+)@(.+).com$";
    private final Pattern emailPattern = Pattern.compile(emailRegex);

    public Person(String name, String email) {
        if(!emailPattern.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
