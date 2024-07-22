package dolphinarium.entities.dolphins;

import dolphinarium.entities.foods.Food;
import dolphinarium.entities.foods.Squid;
import dolphinarium.entities.foods.Herring;
import dolphinarium.entities.foods.Mackerel;

import static dolphinarium.common.ExceptionMessages.DOLPHIN_NAME_NULL_OR_EMPTY;

public abstract class BaseDolphin implements Dolphin{
    private String name;
    private int energy;

    public BaseDolphin(String name, int energy) {
        setName(name);
        setEnergy(energy);
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(DOLPHIN_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public void setEnergy(int energy) {
        this.energy = Math.max(energy, 0);
    }

    public void jump() {
        this.energy = Math.max(this.energy - 10, 0);
    }

    public void eat(Food food) {
       this.energy = food.getCalories();
    }
}
