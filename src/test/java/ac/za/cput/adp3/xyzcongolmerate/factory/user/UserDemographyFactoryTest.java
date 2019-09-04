package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {


    @Test
    public void buildUserDemography() {

        UserDemography userDemography = UserDemographyFactory.buildUserDemography("email","Title", "genderId","raceId",new Date());
        assertEquals(userDemography,userDemography);
        assertNotNull(userDemography.getUserTitle());



    }
}