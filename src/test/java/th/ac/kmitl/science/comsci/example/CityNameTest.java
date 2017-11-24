package th.ac.kmitl.science.comsci.example.models;

import junit.framework.Assert;
import org.junit.Test;
public class CityNameTest {

    String cityName = "Bangkok";
    CityName ctyName = new CityName(cname);

    @Test
    public void testgetCityName(){
        Assert.assertEquals(ctyname.getCityName(),cityName);
    }




}
