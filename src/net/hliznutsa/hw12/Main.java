package net.hliznutsa.hw12;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Person out = new Person();
        String firstPers = out.personInfo("Will", "Smith", "New York", "5435246234634257");
        System.out.println(firstPers);
    }
}
