package dolphinarium.core;

import dolphinarium.entities.dolphins.BottleNoseDolphin;
import dolphinarium.entities.dolphins.Dolphin;
import dolphinarium.entities.dolphins.SpinnerDolphin;
import dolphinarium.entities.dolphins.SpottedDolphin;
import dolphinarium.entities.foods.Food;
import dolphinarium.entities.foods.Herring;
import dolphinarium.entities.foods.Mackerel;
import dolphinarium.entities.foods.Squid;
import dolphinarium.entities.pools.DeepWaterPool;
import dolphinarium.entities.pools.Pool;
import dolphinarium.entities.pools.ShallowWaterPool;
import dolphinarium.repositories.FoodRepository;
import dolphinarium.repositories.FoodRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import static dolphinarium.common.ConstantMessages.*;
import static dolphinarium.common.ExceptionMessages.*;

//TODO Implement all methods
public class ControllerImpl implements Controller{
    private FoodRepository foodRepository;
    private Collection<Pool> pools;


    public ControllerImpl(){
        this.foodRepository = new FoodRepositoryImpl();
        this.pools = new ArrayList<>();
    }
    @Override
    public String addPool(String poolType, String poolName) {
        Pool pool;
        if (poolType.equals("DeepWaterPool")){
            pool = new DeepWaterPool(poolName);
        }
        else if(poolType.equals("ShallowWaterPool")){
            pool = new ShallowWaterPool(poolName);
        }
        else {
            throw new NullPointerException(INVALID_POOL_TYPE);
        }
        if (pools.contains(pool)){
            throw new NullPointerException(POOL_EXISTS);
        }
        else {
            pools.add(pool);
            return String.format(SUCCESSFULLY_ADDED_POOL_TYPE, poolType, poolName);
        }
    }

    @Override
    public String buyFood(String foodType) {
        Food food;
        if (foodType.equals("Squid")){
            food = new Squid();
        }
        else if (foodType.equals("Herring")){
            food = new Herring();
        }
        else if (foodType.equals("Mackerel")){
            food = new Mackerel();
        }
        else {
            throw new IllegalArgumentException(INVALID_FOOD_TYPE);
        }
        foodRepository.add(food);
        return String.format(SUCCESSFULLY_BOUGHT_FOOD_TYPE, foodType);
    }

    @Override
    public String addFoodToPool(String poolName, String foodType) {
        Food food = foodRepository.findByType(foodType);
        if (food == null){
            throw new IllegalArgumentException(String.format(NO_FOOD_FOUND, foodType));
        }
        Pool pool = findPoolByName(poolName);
        pool.addFood(food);
        foodRepository.remove(food);
        return String.format(SUCCESSFULLY_ADDED_FOOD_IN_POOL,foodType, poolName);
    }

    private Pool findPoolByName(String poolName) {
        return pools.stream().filter(pool -> pool.getClass().getSimpleName().equals(poolName))
                .findFirst()
                .orElse(null);
    }

    @Override
    public String addDolphin(String poolName, String dolphinType, String dolphinName, int energy) {
        Pool pool = findPoolByName(poolName);
        Dolphin dolphin;
        if (dolphinType.equals("BottleNoseDolphin")){
            dolphin = new BottleNoseDolphin(dolphinName, energy);
        }
        else if (dolphinType.equals("SpottedDolphin")){
            dolphin = new SpottedDolphin(dolphinName, energy);
        }
        else if (dolphinType.equals("SpinnerDolphin")){
            dolphin = new SpinnerDolphin(dolphinName, energy);
        }
        else {
            throw new IllegalArgumentException(INVALID_DOLPHIN_TYPE);
        }
        if (pool.getDolphins().contains(dolphinName)){
            throw new IllegalArgumentException(DOLPHIN_EXISTS);
        }
        //if (pool.getClass().getSimpleName().equals(dolphin.getClass().getSimpleName())
        return "";
    }

    @Override

    public String feedDolphins(String poolName, String foodType) {

        Food food = foodRepository.findByType(foodType);

        if (food == null) {
            throw new IllegalArgumentException(NO_FOOD_OF_TYPE_ADDED_TO_POOL);
        }

        Pool pool = findPoolByName(poolName);


        if (!pool.getFoods().contains(food)) {
            throw new IllegalArgumentException(NO_FOOD_OF_TYPE_ADDED_TO_POOL);
        }

        pool.getDolphins().forEach(dolphin -> dolphin.eat(food));

        pool.getFoods().remove(food);

        int fedDolphinsCount = pool.getDolphins().size();

        return String.format(DOLPHINS_FED, fedDolphinsCount, pool.getName());
    }


    @Override
    public String playWithDolphins(String poolName) {
        Pool pool = findPoolByName(poolName);
        if (pool.getDolphins().isEmpty()) {
            throw new IllegalArgumentException(NO_DOLPHINS);
        }

        int removedDolphinsCount = 0;

        Iterator<Dolphin> iterator = pool.getDolphins().iterator();
        while (iterator.hasNext()) {
            Dolphin dolphin = iterator.next();
            dolphin.jump();

            if (dolphin.getEnergy() <= 0) {
                iterator.remove();
                removedDolphinsCount++;
            }
        }

        String dolphinWord = removedDolphinsCount == 1 ? "dolphin" : "dolphins";
        return String.format(DOLPHINS_PLAY, poolName, removedDolphinsCount, dolphinWord);
    }


    @Override
    public String getStatistics() {
        // Start with an empty StringBuilder for collecting the results
        StringBuilder statistics = new StringBuilder();

        // Iterate over all pools
        for (Pool pool : pools) {
            // Append the pool name to the result
            statistics.append(String.format(DOLPHINS_FINAL, pool.getName()));

            // Get the list of dolphins in the pool
            Collection<Dolphin> dolphins = pool.getDolphins();

            // Check if the pool has any dolphins
            if (dolphins.isEmpty()) {
                statistics.append(NONE);
            } else {
                // Collect dolphin information
                String dolphinInfo = dolphins.stream()
                        .map(dolphin -> String.format("%s - %d", dolphin.getName(), dolphin.getEnergy()))
                        .reduce((d1, d2) -> d1 + DELIMITER + d2)
                        .orElse("");

                // Append dolphin information
                statistics.append(dolphinInfo).append("\n");
            }
        }

        // Return the complete statistics string
        return statistics.toString().trim();
    }

    // Method to exit the program
    public void exit() {
        // Implement any cleanup or finalization if necessary
        System.out.println("Exiting the program...");
        System.exit(0);  // Terminates the program
    }

}
