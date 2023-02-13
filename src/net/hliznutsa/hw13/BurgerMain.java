package net.hliznutsa.hw13;

public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("Булочка", "Мясо", "Сыр", "Зелень", "Майонез");
        Burger dietBurger = new Burger("Булочка", "Мясо", "Сыр", "Зелень");
        Burger twoMeatBurger = new Burger("Булочка", "Мясо", "Мясо", "Сыр", "Зелень", "Майонез");
    }
}
