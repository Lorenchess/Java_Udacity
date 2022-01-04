package RegEx;

import java.util.regex.Pattern;

public class Person {
    private String name;
    private String email;
    private String username;
    private final String emailRegex = "^(.+)@(.+).com$";
    private final Pattern emailPattern = Pattern.compile(emailRegex);
    private final String usernameRegex = "^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";
    private final Pattern usernamePattern = Pattern.compile(usernameRegex);

    public Person(String name, String email, String userName) {
        if (!emailPattern.matcher(email).matches()) {
            throw new IllegalArgumentException("Error, Invalid email");
        }
        if (!usernamePattern.matcher(userName).matches()) {
            throw new IllegalArgumentException("Invalid username");
        }
        this.username = userName;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
