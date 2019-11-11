package com.asrinnovations;

import java.util.ArrayList;

public class Bank {

    private String name;

    ArrayList<Branch> branches;


    public ArrayList<Branch> getBranches() {
        return branches;

    }

    public Bank(String bankname) {
        this.name = bankname;
        this.branches = new ArrayList<Branch>();
    }


    public void addbranch(String name) {

        int result = findbranch(name);
        if (result < 0) {
            Branch newbranch = new Branch(name);
            branches.add(newbranch);
            System.out.println("Branch successfully added");

        }
        else {
            System.out.println("Branch not found");
        }


    }

    public void addcustomer(String branchname,String custname, double transaction) {
        int result = findbranch(branchname);


        if (result >= 0) {
            Branch branch = branches.get(result);

            branch.addcustomer(custname,transaction);
            System.out.println("Transaction Successfully Added !");


        }
        else {
            System.out.println("Branch not found !");
        }


    }

    public void addfuturetransaction( String branchname,String custname,double newtransaction) {
        int result = findbranch(branchname);

        if(result>=0){
            Branch branch= branches.get(result);
            branch.furthertransacton(custname,newtransaction);
            System.out.println("Transaction Sucessfully Added !");

        }
        else {
            System.out.println("Branch not found !");

        }

    }


    public void branchwisecust(String branchname)
    {
        int result = findbranch(branchname);
        if (result >= 0) {
            System.out.println("Following is a list of customers Branchwise ");


                System.out.println("Following is a list of customers for Branch " + branches.get(result).getBranch());
                branches.get(result).showbankingresults();


                    System.out.println("---------------------------------------BRANCH-COMPLETE");



        }

    }


    public int findbranch(String name) {

        for (int i = 0; i < branches.size(); i++) {
           String getname = branches.get(i).getBranch();
            if (getname.equals(name)) {
                return i;
            }
        }
        return -1;

    }

}
