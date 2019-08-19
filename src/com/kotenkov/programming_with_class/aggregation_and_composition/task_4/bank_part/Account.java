package com.kotenkov.programming_with_class.aggregation_and_composition.task_4.bank_part;

//  Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//  Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
//  имеющим положительный и отрицательный балансы отдельно.

public class Account {

    private Client owner;
    private String accountNumber;
    private boolean accountBlocked;
    private int balanceDollars;

    Account(String accountNumber, boolean accountBlocked, int balanceDollars, Client owner) {
        this.accountNumber = accountNumber;
        this.accountBlocked = accountBlocked;
        this.balanceDollars = balanceDollars;
        this.owner = owner;
        owner.addAccount(this);
    }

    public void increaseBalance(int dollars){
        balanceDollars += dollars;
    }

    public void decreaseBalance(int dollars){
        balanceDollars -= dollars;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isAccountBlocked() {
        return accountBlocked;
    }

    public void setAccountBlocked(boolean accountBlocked) {
        this.accountBlocked = accountBlocked;
    }

    public int getBalanceDollars() {
        return balanceDollars;
    }

    public void setBalanceDollars(int balanceDollars) {
        this.balanceDollars = balanceDollars;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Owner: ");
        sb.append(owner.getFirstname());
        sb.append(" ");
        sb.append(owner.getSurname());
        sb.append(", number: ");
        sb.append(accountNumber);
        sb.append(", blocked: ");
        sb.append(accountBlocked);
        sb.append(", balance: ");
        sb.append(balanceDollars);
        sb.append("$.");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return accountNumber.equals(account.accountNumber);
    }

    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }
}
