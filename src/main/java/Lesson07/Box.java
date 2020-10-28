package Lesson07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruitBox = new ArrayList<>();

    public void put(T... fruit){
        fruitBox.addAll(Arrays.asList(fruit));
    }

    public float getWeight() {
        if (fruitBox.size() == 0) {
            return 0;
        }
        return fruitBox.size() * fruitBox.get(0).getWeight();
    }

    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }

    public void moveTo(Box<T> box) {
        box.put(fruitBox.toArray((T[]) new Object[0]));
        fruitBox.clear();
    }
}