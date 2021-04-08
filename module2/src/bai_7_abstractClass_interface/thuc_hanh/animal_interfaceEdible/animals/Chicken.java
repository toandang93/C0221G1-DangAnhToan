package bai_7_abstractClass_interface.thuc_hanh.animal_interfaceEdible.animals;

import bai_7_abstractClass_interface.thuc_hanh.animal_interfaceEdible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
