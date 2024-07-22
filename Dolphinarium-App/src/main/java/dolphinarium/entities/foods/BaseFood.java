package dolphinarium.entities.foods;

public abstract class BaseFood implements Food{
    private final int calories;

    public BaseFood(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return this.calories;
    }
}
