package jd2.ref;

public class Account {
    private User user;
    private String password;

    public Account(User user, String password) {
        this.user = user;
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
