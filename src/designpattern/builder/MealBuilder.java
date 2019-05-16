package designpattern.builder;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-16
 */
public class MealBuilder {

    /**
     * 套餐一
     * @return
     */
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger(2));
        meal.addItem(new AppleDrink(3));
        return meal;
    }

    /**
     * 套餐二
     * @return
     */
    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new BeefBurger(4));
        meal.addItem(new PearDrink(5));
        return meal;
    }
}
