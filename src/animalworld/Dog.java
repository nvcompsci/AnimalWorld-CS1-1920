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
public class Dog extends Animal {
    
    public Dog() {
        //must call super, because extends Animal
        //super() calls constructor of Animal
        super("Dave","black");
    }
    
    @Override
    public void speak() {
        System.out.println("woof");
    }
}
