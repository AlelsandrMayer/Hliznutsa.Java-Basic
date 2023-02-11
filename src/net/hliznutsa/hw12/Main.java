package net.hliznutsa.hw12;

public class Main {
    public static void main(String[] args) {
        String person1 = Person.personInfo("Will", "Smith", "New York", "2936729462846");
        System.out.println(person1);
        String person2 = Person.personInfo("Jackie", "Chan", "Shanghai", "12312412412");
        System.out.println(person2);
        String person3 = Person.personInfo("Sherlock", "Holmes", "London", "37742123513");
        System.out.println(person3);
    }
}
