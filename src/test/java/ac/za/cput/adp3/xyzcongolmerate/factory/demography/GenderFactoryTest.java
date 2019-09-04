package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GenderFactoryTest {

    @Test
    public void buildGender() {

       Gender gender = GenderFactory.buildGender("Male");
       assertEquals(gender,gender);
       assertNotNull(gender.getGenderId());


       // throw new UnsupportedOperationException("Not supported yet!");

    }
}