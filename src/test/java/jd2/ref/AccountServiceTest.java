package jd2.ref;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AccountServiceTest {

    @Mock
    private UserService userService;

    @Test
    void createAccount() {
        when(userService.createUser(any())).thenReturn(null);
        AccountService accountService = new AccountService(userService);

        Account account = accountService.createAccount("name", "pass");

        assertEquals("pass", account.getPassword());
    }
}