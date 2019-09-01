package jd2.ref;

import java.lang.reflect.Field;

public class UserService {

    User createUser(String name) {
        try {
            User user = new User();
            Field fieldName = user.getClass().getDeclaredField("name");
            fieldName.setAccessible(true);
            fieldName.set(user, name);

            Field lastName = user.getClass().getDeclaredField("lastName");
            lastName.setAccessible(true);
            lastName.set(user, "CustomLastName");
            return user;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
