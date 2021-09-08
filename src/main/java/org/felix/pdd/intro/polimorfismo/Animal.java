package org.felix.pdd.intro.polimorfismo;

public class Animal {

    private String name;
    private String color;

    public void makeSound(){
        System.out.println("Rrrrr");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Vaca vaca = new Vaca();
        vaca.makeSound();

        Dog perro = new Dog();
        perro.makeSound();

        Cat gato = new Cat();
        gato.makeSound();
        gato.makeSound(3);

        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Object);
        System.out.println(animal instanceof Vaca);
        System.out.println(animal instanceof Dog);
        System.out.println(perro instanceof Animal);
        System.out.println(gato instanceof Animal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
