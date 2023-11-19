// Employee.java
import java.util.Date;

public class Employee {
    private int id;
    private String fullName;
    private int age;
    private Date dateOfBirth;
    private double salary;
    private String department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }



    public Employee(int id, String fullName, int age, Date dateOfBirth, double salary, String department) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.department = department;
    }

    // Getters and setters...

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
