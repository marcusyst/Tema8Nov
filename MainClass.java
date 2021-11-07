public class MainClass {
    public static void main(String[] args) {
        Sandwich veganBreadSandwich = new BreadSandwich();
        Sandwich meatRollSandwich = new RollSandwich();

        SandwichMaker veganSandwichMaker = new VeganSandwichMaker(veganBreadSandwich);
        SandwichMaker meatSandwichMaker = new MeatSandwichMaker(meatRollSandwich);

        veganSandwichMaker.makeSandwich();
        meatSandwichMaker.makeSandwich();

        veganBreadSandwich.listIngredients();
        meatRollSandwich.listIngredients();
    }

}
