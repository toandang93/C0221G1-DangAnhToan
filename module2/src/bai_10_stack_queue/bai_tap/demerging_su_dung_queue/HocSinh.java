package bai_10_stack_queue.bai_tap.demerging_su_dung_queue;

import bai_7_abstractClass_interface.bai_tap.interface_Colorable.Colorable;

public class HocSinh  {
    private String name;
    private String gender;
    private int date;

    public HocSinh() {
    }

    public HocSinh(String name, String gender, int date) {
        this.name = name;
        this.gender = gender;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", date=" + date +
                '}';
    }



}
