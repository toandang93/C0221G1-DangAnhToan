package model.bean;

public class Student {
    private int id;
    private String name;
    private int age;
    private int idClass;

    public Student() {
    }

    public Student(int id, String name, int age, int idClass) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.idClass = idClass;
    }

    public Student(String name, int age, int idClass) {
        this.name = name;
        this.age = age;
        this.idClass = idClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }
}
