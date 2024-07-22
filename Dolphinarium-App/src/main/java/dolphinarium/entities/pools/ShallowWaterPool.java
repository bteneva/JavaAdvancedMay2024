package dolphinarium.entities.pools;

public class ShallowWaterPool extends BasePool{
    private String name;
    private static final int CAPACITY = 2;
    public ShallowWaterPool(String name) {
        super(name, CAPACITY);
    }
}
