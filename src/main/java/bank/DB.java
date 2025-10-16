package bank;

import java.util.List;
import java.util.UUID;

public interface DB {
    User getUserById(UUID uuid);
    List<User> getAllUsers();
    List<BankAccount> getAllBankAccount();
    void addUser(User user);
    boolean containsUser(String phone);

}
