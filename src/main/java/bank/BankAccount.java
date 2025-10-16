package bank;

import lombok.Data;

import java.util.UUID;
@Data
public class BankAccount implements Account{
    private UUID idAccount;
    private User user;
    private double money;
    {
        idAccount=UUID.randomUUID();
    }

    public BankAccount(User user) {
        this.user = user;
    }

    @Override
    public void getUserInfo() {
        System.out.println(this.getUser()+","+this.money);
    }
}
