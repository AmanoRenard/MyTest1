package pers.amanorenard.homeworks.dailytraining.y22m4.day29;

import java.util.Objects;

class Student {
    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {}

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


    public void show() {
        System.out.println("name: "+ name + "\nage: " + age);
    }

    public String fullShow() {
        String[] s = this.getClass().toString().split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length;i++) {
            if (i==s.length-1) {
                sb.append(s[i]).append("@");
            } else {
                sb.append(s[i]).append(".\n");
            }
        }
        return
                sb.toString()
                        + String.format("%x",System.identityHashCode(this))
                        + String.format("\n\tContentHashCode: %x",this.hashCode())
                        + "\n\tname: "+ name + "\n\tage: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        String[] s = this.getClass().toString().split("\\.");

        return
                s[s.length-1]
                        +"@"
                        +String.format("%x",System.identityHashCode(this))
                        + String.format("\n\tContentHashCode: %x",this.hashCode())
                        +"\n\tname: "+ name + "\n\tage: " + age;
    }
}
