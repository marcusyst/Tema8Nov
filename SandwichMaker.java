public abstract class SandwichMaker {
    protected Sandwich sandwich;

    public SandwichMaker(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public abstract void makeSandwich();
}
