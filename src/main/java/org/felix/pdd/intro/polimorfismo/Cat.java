package org.felix.pdd.intro.polimorfismo;

public class Cat extends Animal{

    public void makeSound() {
        System.out.println("miauu!");
    }

    public void makeSound(int numero) {
        for (int i = 0; i < numero; i++) {
            System.out.println("miauu!");
        }
    }
}
