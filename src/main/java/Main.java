import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter writer = new FileWriter("employees.txt");

            //generate 10 employees without for loop
            writer.write(new Employee("Employee0", "employee0@example.com", 25, 50000).toString());
            writer.write(new Employee("Employee1", "employee1@example.com", 26, 51000).toString());
            writer.write(new Employee("Employee2", "employee2@example.com", -9, 52000).toString());
            writer.write(new Employee("Employee3", "employee3@example.com", 28, 53000).toString());
            writer.write(new Employee("Employee4", "employee4@example.com", 29, -100).toString());
            writer.write(new Intern("Intern1", "intern1@example.com", 30, 12000).toString());
            writer.write(new Intern("Intern2", "intern2@example.com", 31, 56000).toString());
            writer.write(new Intern("Intern3", "intern3@example.com", 32, 17000).toString());
            writer.write(new Employee("Intern4", "intern4@example.com", 33, 58000).toString());
            writer.write(new Employee("Intern5", "intern5example.com", 34, 59000).toString());

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
