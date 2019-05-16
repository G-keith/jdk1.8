package designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 套餐计算价格
 * @author keith
 * @version 1.0
 * @date 2019-05-16
 */
public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        cost= (float) items.stream().mapToDouble(Item::price).sum();
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.pack().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
