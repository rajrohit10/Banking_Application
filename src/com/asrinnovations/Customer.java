package com.asrinnovations;

import java.util.ArrayList;

public class Customer {
private String name;
    ArrayList<Double> transactions;

    public String getName() {
        return name;
    }

    Customer(String name,double intitialtransaction )


    {this.name=name;
        this.transactions = new ArrayList<Double>();

        transactions.add(intitialtransaction);
    }


    public void addtransaction(double amount){

       // double main= transactions.get(i);
      //  main=main+amount;
        this.transactions.add(amount);
        System.out.println("Transaction has been successfully added in the system ");

    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
