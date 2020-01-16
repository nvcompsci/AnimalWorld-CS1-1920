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
    Dog dog;
    
    public World() {
        dog = new Dog();
        dog.speak();
    }
}
