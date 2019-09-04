package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildUserRole() {

        UserRole userRole = UserRoleFactory.buildUserRole("xyz299","email","Id");
        assertEquals(userRole,userRole);
        assertNotNull(userRole.getUserEmail());
    }
}