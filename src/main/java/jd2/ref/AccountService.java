package jd2.ref;

public class AccountService {
    private final UserService userService;


    public AccountService(UserService userService) {
        this.userService = userService;
    }

    Account createAccount(String name, String password) {
        User user = userService.createUser(name);
        return new Account(user, password);
    }
}
