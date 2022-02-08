package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.printSounds();

        Animal dog = new Dog();
        dog.printSounds();
        //dog.doHunt();

        Animal cat = new Cat();
        cat.printSounds();
    }

        public abstract class Animal { // statik-ok
            public void printSounds() {System.out.println("Animal says");}
            public void printEats() {System.out.println("Animal eats food");}
        }

        static class Dog extends Animal implements Predator {
            @Override
            public void printSounds() {
                System.out.println("Dog says gav");
            }
            
            public void doHunt() {
                System.out.println("Dog hunts");
            }
        }

        static class Cat extends Animal {
            @Override
            public void printSounds() {
                System.out.println("Cat says meow");
            }
        }
}



