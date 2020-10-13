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
public class Animal {
    protected int legs; //membuat atribut legs
    public String name;
    protected Animal(int legs){ //membuat constructor legs
        
    }
    public void walk() { //membuat method walk
        System.out.println("Hewan sedang berjalan");
    }
    public void eat(){
        System.out.println("Hewan sedang makan");
    }
}
    
