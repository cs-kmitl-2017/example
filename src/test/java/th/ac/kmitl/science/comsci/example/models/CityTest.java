package th.ac.kmitl.science.comsci.example.models;

import junit.framework.Assert;
import org.junit.Test;
public class CityTest {

    @Test
    public void testInputCityName(){
        String cityName = "Bangkok";
        City city = new City(cityName);

        Assert.assertEquals(city.getName(),cityName);
    }

}
