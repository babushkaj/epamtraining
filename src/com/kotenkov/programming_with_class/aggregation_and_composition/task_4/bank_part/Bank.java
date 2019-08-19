package com.kotenkov.programming_with_class.aggregation_and_composition.task_4.bank_part;

//  Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//  Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
//  имеющим положительный и отрицательный балансы отдельно.

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Client> clients;
    private List<Account> accounts;

    public Bank() {
        clients = new ArrayList<>();
        accounts = new ArrayList<>();
    }

    public Client createClient(int id, String firstname, String surname){
        Client newClient = new Client(id, firstname, surname);
            if(!clients.contains(newClient)){
                clients.add(newClient);
                return newClient;
            } else {
                System.out.println("The same client has already existed.");
                return null;
            }
    }

    public Account createAccount(String accNumber, boolean accountBlocked, int balance, Client owner){
        Account newAcc = new Account(accNumber, accountBlocked, balance, owner);
        if(!accounts.contains(newAcc)){
            accounts.add(newAcc);
            return newAcc;
        } else {
            System.out.println("The same account has already existed.");
            return null;
        }
    }

    public void blockAccount(Account account){
        account.setAccountBlocked(true);
        System.out.println("Account " + account.getAccountNumber() + " have been blocked.");
    }

    public void unblockAccount(Account account){
        account.setAccountBlocked(false);
        System.out.println("Account " + account.getAccountNumber() + " have been unblocked.");
    }

    public List<Account> findAccountsOfClient(Client client){
        List<Account> list = new ArrayList<>();
        for (Account a: accounts) {
            if(a.getOwner().equals(client)){
                list.add(a);
            }
        }
        return list;
    }

    public Account findAccountByNumber(String accountNumber){
        Account acc = null;
        for (Account a: accounts) {
            if(a.getAccountNumber().equals(accountNumber)){
                acc = a;
            }
        }
        return acc;
    }

    public int calculatePosSum(){
        int sum = 0;
        for (Account a: accounts) {
            if(a.getBalanceDollars() > 0){
                sum += a.getBalanceDollars();
            }
        }
        return sum;
    }

    public int calculatePosSum(Client client){
        List<Account> clientsAcc = findAccountsOfClient(client);
        int sum = 0;
        for (Account a: clientsAcc) {
            if(a.getBalanceDollars() > 0){
                sum += a.getBalanceDollars();
            }
        }
        return sum;
    }

    public int calculateNegSum(){
        int sum = 0;
        for (Account a: accounts) {
            if(a.getBalanceDollars() < 0){
                sum += a.getBalanceDollars();
            }
        }
        return sum;
    }

    public int calculateNegSum(Client client){
        List<Account> clientsAcc = findAccountsOfClient(client);
        int sum = 0;
        for (Account a: clientsAcc) {
            if(a.getBalanceDollars() < 0){
                sum += a.getBalanceDollars();
            }
        }
        return sum;
    }

    public int calculateSum(){
        int sum = 0;
        for (Account a: accounts) {
            sum += a.getBalanceDollars();
        }
        return sum;
    }

    public int calculateSum(Client client){
        List<Account> clientsAcc = findAccountsOfClient(client);
        int sum = 0;
        for (Account a: clientsAcc) {
            sum += a.getBalanceDollars();
        }
        return sum;
    }

    public List<Account> straightSortAccountsByNumber(){
        for (int i = 0; i < accounts.size() - 1; i++) {
            for (int j = 0; j < accounts.size() - i - 1; j++) {
                if(accounts.get(j).getAccountNumber().compareTo(accounts.get(j+1).getAccountNumber()) > 0){
                    swap(accounts, j, j+1);
                }
            }
        }
        return accounts;
    }

    public List<Account> straightSortAccountsByNumber(Client client){
        List<Account> clientsAcc = findAccountsOfClient(client);
        for (int i = 0; i < clientsAcc.size() - 1; i++) {
            for (int j = 0; j < clientsAcc.size() - i - 1; j++) {
                if(clientsAcc.get(j).getAccountNumber().compareTo(clientsAcc.get(j+1).getAccountNumber()) > 0){
                    swap(clientsAcc, j, j+1);
                }
            }
        }
        return clientsAcc;
    }

    public List<Account> backSortAccountsByNumber(){
        for (int i = 0; i < accounts.size() - 1; i++) {
            for (int j = 0; j < accounts.size() - i -1; j++) {
                if(accounts.get(j).getAccountNumber().compareTo(accounts.get(j+1).getAccountNumber()) < 0){
                    swap(accounts, j, j+1);
                }
            }
        }
        return accounts;
    }

    public List<Account> backSortAccountsByNumber(Client client){
        List<Account> clientsAcc = findAccountsOfClient(client);
        for (int i = 0; i < clientsAcc.size() - 1; i++) {
            for (int j = 0; j < clientsAcc.size() - i -1; j++) {
                if(clientsAcc.get(j).getAccountNumber().compareTo(clientsAcc.get(j+1).getAccountNumber()) < 0){
                    swap(clientsAcc, j, j+1);
                }
            }
        }
        return clientsAcc;
    }

    private void swap(List<Account> list, int i, int j){
        Account tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

}
