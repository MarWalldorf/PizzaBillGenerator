public class Main {
    public static void main(String[] args) {
        Pizza basePizza = new Pizza(true);
        basePizza.addSpecialToppings();
        basePizza.addExtraCheese();
        basePizza.ChickenSandwich();
        basePizza.CheeseandHamSandwich();
        basePizza.PastramiSandwich();
        basePizza.takeAway();
        basePizza.getBill();

    }
}