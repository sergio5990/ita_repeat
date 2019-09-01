package jd2.ref;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void createUserNameTest() {
        UserService service =  new UserService();

        User user = service.createUser("superName");

        assertEquals("supername",user.getName());
//        assertEquals("CustomLastName",user.getLastName());

    }

    @Test
    void createUserLastNameTest() {
        UserService service =  new UserService();

        User user = service.createUser("superName");

        assertEquals("CustomLastName",user.getLastName());
    }
}