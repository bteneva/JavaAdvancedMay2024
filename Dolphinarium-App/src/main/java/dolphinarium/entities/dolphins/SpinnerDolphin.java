package dolphinarium.entities.dolphins;

import dolphinarium.entities.pools.ShallowWaterPool;

public class SpinnerDolphin extends BaseDolphin{
    private String name;
    private int energy;
    public SpinnerDolphin(String name, int energy) {
        super(name, energy);
    }
    public void jump() {
        super.jump();
        setEnergy(getEnergy() - 40);
    }
    public void swim(ShallowWaterPool shallowPool) {
        // Swimming in ShallowWaterPool implementation
    }
}
