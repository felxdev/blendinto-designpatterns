package org.felix.pdd.intro.polimorfismo;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("wau!!");
    }
}
