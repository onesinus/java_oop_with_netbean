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
public class SavingsAccount extends Account{
    public int interestRate; //membuat atribut
    public SavingsAccount(double balance, double interest_rate ){ //contructor untuk class savingaccount
        super(balance); //melempar variabel balance ke class account (parent class)
    }
}
