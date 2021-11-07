public class MeatSandwichMaker extends SandwichMaker {

    public MeatSandwichMaker(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public void makeSandwich() {
        sandwich.addIngredient("Butter");
        sandwich.addIngredient("Salami");
        sandwich.addIngredient("Ham");
        sandwich.addIngredient("Plain cheese");
    }
}
