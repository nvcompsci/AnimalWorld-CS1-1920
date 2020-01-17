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
public class World {
    
    Animal[] animals = new Animal[10];
    
    public World() {
        //Polymorphism - "dog" is a Dog and Animal at the same time
        animals[0] = new Dog();
        animals[1] = new Pig("Chris", "rainbow");
        
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
