package bank;

public class BankService implements Bank{
    private DB db;

    public BankService(DB db) {
        this.db = db;
    }

    @Override
    public void transferMoney(BankAccount user1, BankAccount user2, double money) throws BankException {

    }

    @Override
    public void updateMoney(BankAccount uuid, Operation operation) throws BankException {

    }

    @Override
    public void getMoney(BankAccount uuid) {
        db.c
    }

    @Override
    public void createBankAccount(User user) throws BankException {
        if (!db.containsUser(user.getPhone())){
            db.addUser(user);
            System.out.println("Пользователь создан!");
        }
        else System.out.printf("Пользователь:%s уже существует в бд\n");
    }
}
