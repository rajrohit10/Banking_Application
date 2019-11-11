package com.asrinnovations;

import java.util.ArrayList;

public class Branch {
    private String branch;



    ArrayList<Customer> customers;


    Branch(String name){
        this.branch=name;


        customers=new ArrayList<Customer>();
    }


    public String getBranch() {
        return branch;
    }

    public void addcustomer(String name, double initialtransaction){
        System.out.println("Welcome MANAGER, You can add your customer here");
         int result=   findcustomer(name);
         if(result<0){
             Customer customer= new Customer(name,initialtransaction);
             customers.add(customer);
             System.out.println("The customer " + name+ "has been succesfully added in the system with an initial transaction of"+initialtransaction);
         }
         else {
             System.out.println("Customer already present in the system");
         }






    }
    public void furthertransacton(String name,double amount){
        //System.out.println("Welcome MANAGER, You can add further  customer transactions here");
        int result=   findcustomer(name);
        if(result>=0) {
           customers.get(result).addtransaction(amount);
            System.out.println("Transaction added in the system !");



        }
        else {
            System.out.println("Customer not found in the system !");
        }



    }

    public void showbankingresults(){
        System.out.println("Welcome MANAGER, You can see all transactions here");

        for (int i=0;i<customers.size();i++){
            System.out.println("For "+customers.get(i).getName()+" transaction--> " + i);
            for(int j=0;j<customers.get(i).getTransactions().size();j++){
                System.out.println( "Amount " + customers.get(i).getTransactions().get(j));
            }

        }

    }

    public int findcustomer(String name){
        for(int i=0;i<customers.size();i++)
        {
            String getname= customers.get(i).getName();
            if(getname.equals(name)){
                return i;
            }

        }
        return -1;
    }



}
