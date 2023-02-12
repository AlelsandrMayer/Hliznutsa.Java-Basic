package net.hliznutsa.hw12;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person("Steven", "Sigle", "Elenovka", "+30983412405");
        System.out.println(firstPerson.personInfo());
        Person secondPerson = new Person("Donald", "Tramp", "Zhmerinka", "+380956324093");
        System.out.println(secondPerson.personInfo());
        Person thirdPerson = new Person("Adolph", "Hitler", "Hell", "666");
        System.out.println(thirdPerson.personInfo());
    }
}
