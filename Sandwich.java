import java.util.ArrayList;
import java.util.List;

public abstract class Sandwich {
    protected ArrayList<String> ingredients;

    public Sandwich() {
        ingredients = new ArrayList<>();
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public List<String> getIngredients() {
        return this.ingredients;
    }

    public abstract void listIngredients();
}
