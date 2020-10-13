/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking;

/**
 *
 * @author SATRIA
 */
public class Account {
    protected double balance; //inisiasi atribut
    public static String account_type;
    public Account (double init_balance){ //constructor method
        balance = init_balance; 
        
    }
    public double getBalance(){ //method yang memberikan atriburt balance
        return balance;
    }
    public boolean deposite(double amt){ //method yang menambahkan saldo balance
        balance += amt; 
        return true;
    }
    public boolean withdraw (double amt){ //method yang mengurangi saldo balance
        if (amt > balance) { //jika saldo kurang
            return false;
        }
        balance -= amt; //jika saldo cukup
        return true;
    }
}
