public class Main {
    public static void main(String[] args) {
        Pizza basePizza = new Pizza(true);
        basePizza.addSpecialToppings();
        basePizza.addExtraCheese();
        basePizza.addExtraHam();
        basePizza.addExtraPepperoni();
        basePizza.addExtraChicken();
        basePizza.addExtraCorn();
        basePizza.addExtraOnion();
        basePizza.addExtraTomatoes();
        basePizza.addExtraCucumber();
        basePizza.addExtraRedPepper();
        basePizza.ChickenSandwich();
        basePizza.CheeseandHamSandwich();
        basePizza.PastramiSandwich();
        basePizza.VegetarianSandwich();
        basePizza.takeAway();
        basePizza.getBill();

    }
}