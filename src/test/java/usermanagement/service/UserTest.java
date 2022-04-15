package usermanagement.service;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UserTest {

    @Test
    public void test_equality() {
        User user1 = new User();
        user1.setFirstName("f");
        user1.setLastName("l");

        User user2 = new User();
        user2.setFirstName("f");
        user2.setLastName("l");


        assertTrue(user1.equals(user2));

    }
}

