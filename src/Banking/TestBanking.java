/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

/**
 *
 * @author SATRIA
 */
public class TestBanking { //membuat class
    public static void main(String[ ] args){
        Account account = new Account(0); //menurunkan class account ke sebuah variabel (inheritance)
        double balance = account.getBalance(); //memanggil method getBalance dari class account
        System.out.println(balance);  
        
        account.deposite(20000); //menambahkan saldo
        double balance2 = account.getBalance(); //memanggil method getBalance dari class account
        System.out.println(balance2);   
        
        account.withdraw(5000); //mengurangi saldo
        double balance3 = account.getBalance(); //memanggil method getBalance dari class account
        System.out.println(balance3);
        
        //testing untuk class bank
        Bank bank = new Bank();
        int totalCustomer = bank.getNumOfCustomers();
        System.out.println("Total customer :"+ totalCustomer);
        
        bank.addCustomer("bambang", "sudi");
        totalCustomer = bank.getNumOfCustomers();
        System.out.println("Total customer :"+ totalCustomer);
        
        Customer customer = bank.getCustomer(5);
        
        System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
        
        SavingsAccount sa = new SavingsAccount(25000, 5000); //menurunkan kelas savingaccount
        System.out.println("Rp"+sa.getBalance());
        
        if (sa instanceof SavingsAccount ){ //apakah instance dari checking account
            sa.account_type = "Saving Account ";
        }else{
            sa.account_type = "Checking Account ";
        }
        System.out.println(sa.account_type);
        CheckingAccount ca = new CheckingAccount(25000, 5000); //menurunkan kelas savingaccount
        ca.withdraw(31000);
        System.out.println("Rp"+ca.getBalance());
        
        if (ca instanceof CheckingAccount ){ //apakah instance dari checking account
            ca.account_type = "Checking Account ";
        }else{
            ca.account_type = "Saving Account ";
        }
        System.out.println(ca.account_type);
    }
    
   
}
