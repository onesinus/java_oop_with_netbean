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
public class Cat extends Animal implements Pet{
    public Cat(String Name) { // membuat constructor class cat dengan parameter name
        super(4);
    }
    public Cat(){ //membuat construktor cat tanpa parameter   
       super(4);
    }
    public String getName(){ //membuat method untuk mendapatkan atribut name
        return name;
    }
    public void setName(String name) { //membuat method untuk mengubah atribut name
        
    }
    public void play() { //membuat method
        System.out.println("Kucing suka main");
    }
    public void eat() { //membuat method
        System.out.println("Kucing sedang makan");
    }
}
