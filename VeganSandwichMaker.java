public class VeganSandwichMaker extends SandwichMaker {

    public VeganSandwichMaker(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public void makeSandwich() {
        this.sandwich.addIngredient("Flora butter");
        this.sandwich.addIngredient("Tomatoes");
        this.sandwich.addIngredient("Lettuce");
        this.sandwich.addIngredient("Tofu beef");
    }
}
