import java.util.regex.Pattern;

public class Customer {
    public String firstName;
    public String lastName;
    public String email;

    @Override
    public String toString(){
        return "First name: " + firstName + ", Last name: " + lastName + ", Email: " + email;
    }

    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.email = email;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    //add a regex function to check if the email is valid, if not throw an IllegalArgument exception

}

