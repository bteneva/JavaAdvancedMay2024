package dolphinarium.entities.dolphins;

import dolphinarium.entities.pools.DeepWaterPool;

public class BottleNoseDolphin extends BaseDolphin {

    public BottleNoseDolphin(String name, int energy) {
        super(name, energy);
    }

    @Override
    public void jump() {
        // Calls the jump method from Dolphin to reduce by 10
        super.jump();
        // Reduces energy by an additional 190 units
        setEnergy(getEnergy() - 190);
    }

    public void swim(DeepWaterPool pool) {
        // Implementation specific to swimming in DeepWaterPool
        // Assuming DeepWaterPool class exists with appropriate methods
    }
}
