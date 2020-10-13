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
public class Fish extends Animal { //membuat class fish dengan parent animal dan mengimplementasikan interface pet
    public Fish() {
        super(0);
    }
    
    public void play() { //membuat method
        System.out.println("ikan sedang bermain");
    }
    public void eat() { //membuat method
        System.out.println("Ikan sedang makan");
    }
    public void walk() { //membuat method
        System.out.println("Ikan tidak dapat berjalan ");
    }
}