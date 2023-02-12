package net.hliznutsa.hw12;

public class Person {
    public String name;
    public String surname;
    public String city;
    public String phoneNum;

    public String personInfo(String name, String surname, String city, String phoneNum) {
        setValues(name, surname, city, phoneNum);
        return getValues();
    }

    public void setValues(String name, String surname, String city, String phoneNum) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phoneNum = phoneNum;
    }

    public String getValues() {
        return "Позвонить гражданину " + this.name + " " + this.surname + ", c города " + this.city + ", можно по номеру " + this.phoneNum;
    }
}
