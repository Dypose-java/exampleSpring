package bank;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService(new BankDB());
        bankService.createBankAccount(new User("name","89688450690"));
        bankService.createBankAccount(new User("name1","89688450691"));

    }
}
