package bai_7_abstractClass_interface.thuc_hanh.animal_interfaceEdible;


import bai_7_abstractClass_interface.thuc_hanh.animal_interfaceEdible.fruit.Apple;
import bai_7_abstractClass_interface.thuc_hanh.animal_interfaceEdible.fruit.Fruit;
import bai_7_abstractClass_interface.thuc_hanh.animal_interfaceEdible.fruit.Orange;

public class Test {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}