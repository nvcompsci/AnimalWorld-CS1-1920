/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalworld;

/**
 *
 * @author jword
 */
//superclass
public abstract class Animal {
    //Fields
    private String name;
    private int age;
    private double weight, height;
    private String color;
    private boolean alive;
    
    //Constructor
    public Animal(String name, String color) {
        this.name = name;
        this.age = 0;
        this.weight = Math.random() * 500.0;
        this.height = Math.random() * 10.0;
        this.color = color;
        this.alive = true;
        System.out.println("("+this.name+" was born.)");
    }
    
    //Methods
    public abstract void speak();
    
    public void grow() {
        age++;
    }
    
    public void eat(Food food) {
        System.out.println("Nom nom nom");
        this.weight += food.weight;
    }
    
    public void fight(Animal other) {
        if (this.weight > other.weight) {
            other.alive = false;
        } else {
            this.alive = false;
        }
    }
    
    //Mutators - Getters / Setters
    
}
