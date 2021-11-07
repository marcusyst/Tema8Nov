public class RollSandwich extends Sandwich {

    public RollSandwich() {
        super();
        this.addIngredient("Bread Roll");
    }

    @Override
    public void listIngredients() {
        System.out.print("This roll sandwich contains: ");
        StringBuilder ingredientList = new StringBuilder();
        for (String ingredient : ingredients) {
            ingredientList.append(ingredient).append(", ");
        }
        ingredientList.delete(ingredientList.length() - 2, ingredientList.length());
        System.out.println(ingredientList);
    }
}
