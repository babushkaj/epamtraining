package com.kotenkov.programming_with_class.aggregation_and_composition.task_4;

//  Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//  Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
//  имеющим положительный и отрицательный балансы отдельно.

import com.kotenkov.programming_with_class.aggregation_and_composition.task_4.bank_part.Account;
import com.kotenkov.programming_with_class.aggregation_and_composition.task_4.bank_part.Bank;
import com.kotenkov.programming_with_class.aggregation_and_composition.task_4.bank_part.Client;

import java.util.List;

public class MainTask4 {

    public static void main(String[] args) {

        Bank bank = new Bank();
        Client client1 = bank.createClient(1,"Vasily", "Vasilyev");
        Account acc1 = bank.createAccount("BY04AKBB36029110100040000000", false, 100, client1);
        Account acc2 = bank.createAccount("BY04AKBB12345678900040000000", false, -50, client1);
        Account acc3 = bank.createAccount("BY04AKBB76548765493930000000", false, -12, client1);
        Account acc4 = bank.createAccount("BY04AKBB23487423872340000000", false, 400, client1);

        //the attempt to create and add the same account as acc4
        Account acc5 = bank.createAccount("BY04AKBB23487423872340000000", false, 400, client1);

        //block acc1
        bank.blockAccount(acc1);

        //get all accounts of client1
        List<Account> allAccountsOfClient1 = bank.findAccountsOfClient(client1);
        System.out.println("All accounts of " + client1.getFirstname() + " " + client1.getSurname());
        for (Account a: allAccountsOfClient1) {
            System.out.println(a);
        }

        //unblock acc1
        bank.unblockAccount(acc1);

        //straight sorting of clients1 accounts
        allAccountsOfClient1 = bank.straightSortAccountsByNumber(client1);

        System.out.println("Straight sorted by numbers accounts of " + client1.getFirstname() + " " + client1.getSurname());
        for (Account a: allAccountsOfClient1) {
            System.out.println(a);
        }

        //back sorting of clients1 accounts
        allAccountsOfClient1 = bank.backSortAccountsByNumber(client1);
        System.out.println("Back sorted by numbers  accounts of " + client1.getFirstname() + " " + client1.getSurname());
        for (Account a: allAccountsOfClient1) {
            System.out.println(a);
        }

        //positive accounts' sum
        String clientName = client1.getFirstname() + " " + client1.getSurname();
        int posSum = bank.calculatePosSum(client1);
        System.out.println("Positive accounts' sum of " + clientName + ": " + posSum + " dollars.");

        //negative accounts' sum
        int negSum = bank.calculateNegSum(client1);
        System.out.println("Negative accounts' sum of " + clientName + ": " + negSum + " dollars.");

        //all accounts' sum
        int sum = bank.calculateSum(client1);
        System.out.println("All accounts' sum of " + clientName + ": " + sum + " dollars.");

        //searching by account's number
        String number = "BY04AKBB76548765493930000000";
        Account acc = bank.findAccountByNumber(number);
        System.out.println("Result of searching by account's number:");
        if(acc != null){
            System.out.println(acc);
        } else {
            System.out.println("Account with that number haven't been found.");
        }
    }

}
