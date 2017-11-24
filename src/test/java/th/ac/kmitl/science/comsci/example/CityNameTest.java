package th.ac.kmitl.science.comsci.example.models;

import junit.framework.Assert;
import org.junit.Test;
public class CityNameTest {
    String cname = "Bangkok";
    CityName ctyname = new CityName(cname);
    @test
    public void testgetCityName(){
        Assert.assertEquals(ctyname.getCityName(),"Bangkok");
    }




}
