package usermanagement.service;


import org.junit.Test;
import usermanagement.entity.Person;

import static org.junit.Assert.assertEquals;

public class TransformServiceTest {

    @Test
    public void test_toUserDomain() {
        TransformService transformTest = new TransformService();
        Person person = new Person();

        person.setmName("mName1");
        person.setfName("fName1");
        person.setlName("lName1");
        person.setCompanyName("comp");

        User u = transformTest.toUserDomain(person);

        assertEquals("fName1", u.getFirstName());
        assertEquals("lName1", u.getLastName());
        assertEquals("comp", u.getCompanyName());
    }

    @Test
    public void test_toUserEntity() {
        TransformService transformTest = new TransformService();
        User user = new User();

        user.setFirstName("f");
        user.setLastName("l");

        Person person = transformTest.toUserEntity(user);

        assertEquals("f", person.getfName());
        assertEquals("l", person.getlName());


    }
}

