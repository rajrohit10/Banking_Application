package com.asrinnovations;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        boolean quit= false;


        System.out.println("Enter a name for the bank");
        String bankname =scanner.nextLine();
        Bank newbank = new Bank(bankname);

        while (!quit){
            printinstructons();
            System.out.println("Choose one from the options");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printinstructons();
                    break;
                case 1:
                    System.out.println("Enter the new branch name");
                    newbank.addbranch(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Enter the customer details [BRANCH NAME, CUSTOMER NAME, INITIAL TRANSACTION]");
                    newbank.addcustomer(scanner.nextLine(),scanner.nextLine(),scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Enter new transactions [BRANCH NAME, CUSTOMER NAME, INITIAL TRANSACTION]");
                    newbank.addfuturetransaction(scanner.nextLine(),scanner.nextLine(),scanner.nextDouble());
                    break;
                case  4:
                    System.out.println("Enter the branch");
                    newbank.branchwisecust(scanner.nextLine());
                    break;
                case 5:
                    quit=true;
                    break;
            }
        }
    }
       public static void printinstructons()
       {
           System.out.println("Choose 0 to print instructions again");
           System.out.println("Choose 1 to add branch name");
           System.out.println("Choose 2 to add customer details");
           System.out.println("Choose 3 to add transactions to the customers");
           System.out.println("Choose 4 to print branch wise customer list");
           System.out.println("Choose 5 to exit this system ");
       }

}
