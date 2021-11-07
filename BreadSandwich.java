public class BreadSandwich extends Sandwich {

    public BreadSandwich() {
        super();
        this.addIngredient("Bread");
    }

    @Override
    public void listIngredients() {
        System.out.print("This bread sandwich contains: ");
        StringBuilder ingredientList = new StringBuilder();
        for (String ingredient : ingredients) {
            ingredientList.append(ingredient).append(", ");
        }
        ingredientList.delete(ingredientList.length() - 2, ingredientList.length());
        System.out.println(ingredientList);
    }
}
