package model.bean;

public class Employee {
    private String code;
    private String name;
    private String birthday;

    public Employee() {
    }

    public Employee(String code, String name, String birthday) {
        this.code = code;
        this.name = name;
        this.birthday = birthday;
    }

    public Employee(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
