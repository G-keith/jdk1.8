package designpattern.builder;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-16
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger(2));
        meal.addItem(new AppleDrink(3));
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new BeefBurger(4));
        meal.addItem(new PearDrink(5));
        return meal;
    }
}
