package dolphinarium.entities.dolphins;

import dolphinarium.entities.foods.BaseFood;
import dolphinarium.entities.pools.DeepWaterPool;
import dolphinarium.entities.pools.ShallowWaterPool;

public class SpottedDolphin extends BaseDolphin {
    private String name;
    private int energy;
    public SpottedDolphin(String name, int energy) {
        super(name, energy);
    }

    public void jump() {
        super.jump();
        // Reduces energy by an additional 190 units
        setEnergy(getEnergy() - 90);
    }
    public void swim(DeepWaterPool deepPool) {
        // Implementation specific to swimming in DeepWaterPool
        // Assuming DeepWaterPool class exists with appropriate methods
    }
    public void swim(ShallowWaterPool shallowPool) {
        // Swimming in ShallowWaterPool implementation
    }

}
