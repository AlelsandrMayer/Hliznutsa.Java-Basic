package net.hliznutsa.hw13;

public class Burger {
    private String bun;
    private String[] meat = new String[2];
    private String cheese;
    private String greens;
    private String mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat[0] = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Обычный бургер - состав: " + this.bun + ", " + this.meat[0] + ", " + this.cheese + ", " + this.greens + ", " + this.mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat[0] = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Диетический бургер - состав: " + this.bun + ", " + this.meat[0] + ", " + this.cheese + ", " + this.greens);
    }

    public Burger(String bun, String meat, String secondMeat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat[0] = meat;
        this.meat[1] = secondMeat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Бургер с двойным мясом - состав: " + this.bun + ", " + this.meat[0] + ", " + this.meat[1] + ", " + this.cheese + ", " + this.greens + ", " + this.mayonnaise);
    }
}
