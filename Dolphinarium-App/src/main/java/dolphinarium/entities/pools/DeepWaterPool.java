package dolphinarium.entities.pools;

import dolphinarium.entities.dolphins.Dolphin;
import dolphinarium.entities.foods.Food;

import java.util.Collection;

public class DeepWaterPool extends BasePool{
    private String name;
    private static final int CAPACITY = 5;

    public DeepWaterPool(String name) {
        super(name, CAPACITY);
    }
}
