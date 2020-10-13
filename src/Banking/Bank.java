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
public class Bank {
    public List<Customer> customers = new ArrayList<Customer>(); //membuat atribut 
    public int numberOfCustomers = 0; //membuat atribut
    private static Bank bankInstance;
    
    public Bank (){
        String[] customerFirstNames = {"joko", "jok", "jin", "jon","jack"}; //array data nama pertama   
        String[] customerLastNames = {"sudi", "sad", "sedi", "weka","ken"};  //array data nama terakhir
        for (String name: customerFirstNames) { //iterasi data customer
            numberOfCustomers += 1; //menambahkan
            Customer newCustomer = new Customer(name,customerLastNames[numberOfCustomers    -1]);
            customers.add(newCustomer);
        }
//        
    }
    public void addCustomer(String f,String l){
        numberOfCustomers += 1; 
        Customer newCustomer = new Customer(f,l);
        customers.add(newCustomer);
    }
    public int getNumOfCustomers(){ //accesor untuk mendapatkan nilai atribut 
        return numberOfCustomers;
    }
    public Customer getCustomer(int index){ //menambahkan method untuk mendapatkan customer sesuai index
        return customers.get(index  -1); 
    }
    public static Bank getBank(){
        bankInstance = new Bank();
        return bankInstance;
    }
            
}
