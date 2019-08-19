package com.kotenkov.programming_with_class.aggregation_and_composition.task_4.bank_part;

//  Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//  Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
//  имеющим положительный и отрицательный балансы отдельно.

import java.util.ArrayList;
import java.util.List;

public class Client {
    private int id;
    private String firstname;
    private String surname;
    private List<Account> accounts;

    Client(int id, String firstname, String surname) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        accounts = new ArrayList<>();
    }

    void addAccount(Account account){
            if(!accounts.contains(account)) {
                accounts.add(account);
                account.setOwner(this);
            }
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (id != client.id) return false;
        if (!firstname.equals(client.firstname)) return false;
        return surname.equals(client.surname);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + firstname.hashCode();
        result = 31 * result + surname.hashCode();
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id = ");
        sb.append(id);
        sb.append(", firstname: ");
        sb.append(firstname);
        sb.append(", surname: ");
        sb.append(surname);
        return sb.toString();
    }
}
