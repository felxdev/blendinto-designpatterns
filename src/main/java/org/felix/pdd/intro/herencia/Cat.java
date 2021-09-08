package org.felix.pdd.intro.herencia;

public class Cat extends Animal implements FourLegged, OxygenBreather{

    public static void main(String[] args) {
        Cat gato = new Cat();
    }

    @Override
    public void run(String destination) {

    }

    @Override
    public void breath() {

    }
}
