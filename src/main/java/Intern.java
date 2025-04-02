import java.sql.SQLOutput;

public class Intern extends Employee {

    private final int MAX_SALARY = 20000;

    public Intern(String name, String email, int age, int salary) {

        super(name, email, age, salary);
        if(salary > MAX_SALARY){
            System.out.println("Intern salary cannot exceed " + MAX_SALARY);
            this.salary = MAX_SALARY;
        }
    }

    @Override
    public void setSalary(int salary) {

        if (salary > MAX_SALARY){
            System.out.println("Intern salary cannot exceed " + MAX_SALARY);
            this.salary = MAX_SALARY;
        } else {
            super.setSalary(salary);
        }
    }
}
