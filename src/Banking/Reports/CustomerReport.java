/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking.Reports;

import Banking.Account;
import Banking.Bank;
import Banking.Customer;

/**
 *
 * @author SATRIA
 */
public class CustomerReport {
    public static void main(String[ ] args){ 
        Bank bca = new Bank(); // menurunkan class bank
        bca.addCustomer("joko", "udin"); //memanggil method addcustomer pada class bank
        
        
        Bank bac = new Bank(); //menurunkan class bank
        bac.addCustomer("jaka", "rata"); //memanggil method addcustomer 
        bac.addCustomer("kuki", "kiki");
        for (int i = 0; i < bca.numberOfCustomers; i++) { //menyediakan data customer
          Customer cust =  bca.customers.get(i); //
          cust.addAccount(new Account(0));
            System.out.println(cust.getFirstName()+" " +cust.getLastName());
            System.out.println("Saldo ="+cust.getAccount(1).getBalance());
            
        }
        Customer cust1 =  bca.customers.get(1); //mendapatkan data customer dengan ID
        cust1.getAccount(1).deposite(20000); //memanggil method deposite pada account
        System.out.println("Saldo ="+cust1.getAccount(1).getBalance()); //memanggil method balance
    }
}
