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
public class CheckingAccount extends Account{
    public double overdraftProtection; //membuat atribut
    public CheckingAccount(double balance, double protect){ //contructor untuk class checkingccount
        super(balance); //melempar variabel balance ke class account (parent class)
        overdraftProtection = protect;
    }
    public CheckingAccount(double balance){ //override constructor
        this(balance,balance); //melewatkan balance pada constructor lain 
    }
    public boolean withdraw (double amt){ //override method withdraw
        if (overdraftProtection >= amt-balance){
            balance -= amt; //jika saldo cukup
            return true;
        }
        return false;
        
    }
}


