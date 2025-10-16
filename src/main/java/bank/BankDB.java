package bank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BankDB implements DB {

    private Map<String, BankAccount> bd = new HashMap<>();

    @Override
    public User getUserById(UUID uuid) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public List<BankAccount> getAllBankAccount() {
        return bd.values()
                .stream()
                .toList();
    }

    @Override
    public void addUser(User user) {
        if (user == null) throw new IllegalArgumentException("пользователь null");
        bd.put(user.getPhone(), new BankAccount(user));
    }

    @Override
    public boolean containsUser(String phone) {
        return bd.containsKey(phone);
    }
}
