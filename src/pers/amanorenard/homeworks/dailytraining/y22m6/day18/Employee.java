package pers.amanorenard.homeworks.dailytraining.y22m6.day18;

public class Employee {
    private String id;
    private String name;
    private int age;
    private char sex;
    private String section;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, int age, char sex, String section, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.section = section;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", section='" + section + '\'' +
                ", salary=" + salary +
                '}';
    }
}
