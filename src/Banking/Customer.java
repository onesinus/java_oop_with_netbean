/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATRIA
 */
public class Customer {
    private String firstName; //mendefinisikan atribut
    private String lastName;
    private Account account;
    private List<Account> accounts = new ArrayList<Account>(); //mendefinisikan array of account
    
    public Customer(String f,String l){ //mendefinisikan constructor
        firstName = f; //mengubah nilai atribut
        lastName = l;
    }
    public String getFirstName(){ //deklarasi getter
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Account getAccount(){
        return account;
    }
    public Account setAccount(Account acct){ //deklarasi setter
        account = new Account(0);
        return account;
    }
    public void addAccount(Account acct){ //method menambah account
        accounts.add(acct);
    }
    public Account getAccount(int index){ //method mengambil account berdasarkan index
        return accounts.get(index  -1); 
    }
    public int getNumOfAccounts(){ //membuat method mengembalikan account
        return accounts.size();
    }
}
