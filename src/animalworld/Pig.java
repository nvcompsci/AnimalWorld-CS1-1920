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
public class Pig extends Animal implements Food {
    public Pig(String name, String color) {
        super(name, color);
    }
    
    @Override
    public void speak() {
        System.out.println("oink");
    }
}
