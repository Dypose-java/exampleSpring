package bank;

import java.util.UUID;

public interface Bank {
    void transferMoney(BankAccount user1,BankAccount user2,double money) throws BankException;
    void updateMoney(BankAccount uuid,Operation operation) throws  BankException;
    void getMoney(BankAccount uuid);
    void createBankAccount(User user) throws BankException;

}
