public class Pizza {
   private int price;
   private Boolean veg;

   private int extraCheesePrice = 100;
   private int extraHamPrice = 100;
   private int SpecialToppingsPrice = 150;
   private int backPackPrice = 20;
   private int Chickensandwich = 50;
   private int CheeseandHamsandwich = 60;
   private int Pastramisandwich = 80;
   private int Vegetariansandwich = 70;

   private int basePizzaPrice;

   private boolean isExtraCheeseAdded = false;
   private boolean isExtraHamAdded = false;
   private boolean isSpecialToppingsAdded = false;
   private boolean isChickenSandwich = false;
   private boolean isCheeseandHamSandwich = false;
   private boolean isPastramiSandwich = false;
   private boolean isVegetarianSandwich = false;
   private boolean isOptedForTakeAway = false;
   public Pizza(boolean veg){
      this.veg = veg;
      if(this.veg){
         this.price = 300;

      }else {
         this.price = 400;
      }
      basePizzaPrice = this.price;
   }

   public void addExtraCheese(){
      isExtraCheeseAdded = true;
      this.price += extraCheesePrice;
   }

   public void addExtraHam(){
      isExtraHamAdded = true;
      this.price +=extraHamPrice;
   }

   public void addSpecialToppings(){
      isSpecialToppingsAdded = true;
      this.price +=SpecialToppingsPrice;
   }

   public void ChickenSandwich(){
     isChickenSandwich = true;
      this.price +=Chickensandwich;
   }

   public void CheeseandHamSandwich(){
      isCheeseandHamSandwich = true;
      this.price +=CheeseandHamsandwich;
   }

   public void PastramiSandwich(){
      isPastramiSandwich = true;
      this.price +=Pastramisandwich;
   }

   public void VegetarianSandwich(){
      isVegetarianSandwich = true;
      this.price +=Vegetariansandwich;
   }

   public void takeAway(){
      isOptedForTakeAway = true;
      this.price += backPackPrice;
   }

   public void getBill(){
      String bill = "";
      System.out.println("Pizza: "+basePizzaPrice);
      if(isExtraCheeseAdded){
         bill += "Extra cheese added: "+extraCheesePrice + "\n";
      }
      if(isExtraHamAdded){
         bill +="Extra ham added: " +extraHamPrice + "\n";
      }
      if(isSpecialToppingsAdded){
         bill += "Special Toppings added: "+SpecialToppingsPrice + "\n";
      }
      if(isChickenSandwich){
         bill += "ChickenSandwich added: "+Chickensandwich + "\n";
      }
      if(isCheeseandHamSandwich){
         bill += "CheeseandHamSandwich added: "+CheeseandHamsandwich + "\n";
      }
      if(isPastramiSandwich){
         bill += "PastramiSandwich added: "+Pastramisandwich + "\n";
      }
      if(isVegetarianSandwich){
         bill += "VegetarianSandwich added: "+Vegetariansandwich + "\n";
      }
      if(isOptedForTakeAway){
         bill += "Take away: "+backPackPrice + "\n";
      }
      bill += "Bill: "+this.price + "\n";
      System.out.println(bill);

   }
}
/**
 * Base pizza: 300
 * Toppings: 150
 * Cheese: 100
 * Take away: 20
 */
