public class Employee {
    private String name;
    private String email;
    private int age;
    protected int salary;

    public Employee(String name, String email, int age, int salary) {
        setName(name);
        setEmail(email);
        setSalary(salary);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            this.age = 0;
        }else{
            this.age = age;
        }

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary < 0){
            this.salary = 0;
        }else{
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}' + "\n";
    }
}
