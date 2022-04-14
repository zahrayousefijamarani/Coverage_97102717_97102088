package usermanagement.exception;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserNotFoundExceptionTest {


    @Test
    public void test_person_default_constructor() {
        UserNotFoundException userExc = new UserNotFoundException("ERROR: User Not Found", 10);

        assertEquals((Integer) 10, userExc.getUserId());

    }

}
