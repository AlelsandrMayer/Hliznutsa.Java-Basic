package net.hliznutsa.hw14;

public class RunTrackerMain {
    public static void main(String[] args) {
        FitnessTracker person1 = new FitnessTracker("Andrei", 23, 8, 1998, "asfasasd@com.ua", "21432421321", "Vasilek", 56.6, 120, 12000);
        person1.personInfo();

        FitnessTracker person2 = new FitnessTracker("Jack", 20, 2, 1990, "sfddgfhjsd@gmail.ua", "532543453", "Ivanov", 80, 140, 8000);
        person2.personInfo();

        FitnessTracker person3 = new FitnessTracker("Vova", 2, 6, 1980, "sadgfdsgsda@ukr.net", "324632632", "Smirnov", 76.5, 100, 9500);
        person3.personInfo();

        person3.setStepsPerDay(5000);
        person3.setPressure(90);
        person3.personInfo();

        person1.setSurname("Komarov");
        person1.setWeight(101);
        person1.personInfo();
    }
}
