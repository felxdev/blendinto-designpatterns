package org.felix.pdd.intro.herencia;

public class Animal {
    String name;
    char sex;
    int age;
    int weight;
    String color;

    void breath(){
        System.out.println("respira");
    }
    void eat(String food){
        System.out.println("come "+food);
    }
    void run(String destination){
        System.out.println("Va al "+destination);
    }
    void sleep(int hours){
        System.out.println("duerme " +hours);
    }
}
