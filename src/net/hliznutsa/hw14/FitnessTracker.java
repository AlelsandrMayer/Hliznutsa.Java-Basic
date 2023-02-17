package net.hliznutsa.hw14;

public class FitnessTracker {


    private final String name;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private String email;
    private String phoneNum;
    private String surname;
    private double weight;
    private int pressure;
    private int stepsPerDay;
    public int age;

    public FitnessTracker(String name, int birthDay, int birthMonth, int birthYear, String email, String phoneNum, String surname, double weight, int pressure, int stepsPerDay) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.age = 2023 - birthYear;
        this.email = email;
        this.phoneNum = phoneNum;
        setSurname(surname);
        setWeight(weight);
        setPressure(pressure);
        setStepsPerDay(stepsPerDay);
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public int getStepsPerDay() {
        return this.stepsPerDay;
    }

    public String getName() {

        return this.name;
    }

    public int getBirthDay() {
        return this.birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getSurname() {
        return this.surname;
    }

    public double getWeight() {
        return this.weight;
    }

    public int getPressure() {
        return this.pressure;
    }

    public int getAge() {
        return this.age;
    }

    public void personInfo() {
        String nameAndSurname = "Имя: " + getName() + "\nФамилия: " + getSurname();
        String birthDay = "\nДата рождения: " + getBirthDay() + "." + getBirthMonth() + "." + getBirthYear() + "\nВозраст: " + getAge() + "  год(а)";
        String contacts = "\nПочта: " + getEmail() + "\nНомер телефона: " + getPhoneNum();
        String physicalParamerts = "\nВес: " + getWeight() + "\nДавление: " + getPressure() + "\nШаги за день: " + getStepsPerDay();
        String persInfo = nameAndSurname + birthDay + contacts + physicalParamerts;
        System.out.println("Пользователь:\n" + persInfo + "\n-------------------------------");
    }
}