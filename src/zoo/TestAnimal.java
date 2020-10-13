/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author SATRIA
 */
public class TestAnimal {
    public static void main(String[ ] args){ //main method
        Fish f = new Fish();
        f.walk();
        f.eat();
        
        Cat C = new Cat();
        C.eat();
        C.walk();
        
        Spider s = new Spider();
        s.eat();
        Animal a = new Animal(0);
        a.eat();
        
        Pet p = new Cat();
        p.play();
    }
    
    
}
