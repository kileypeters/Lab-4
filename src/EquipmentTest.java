import org.junit.Assert;

public class EquipmentTest
{

    // TODO: test full constructor, getters, and toString
    public void constructorTest() throws AssertException
    {
       // .getColor .getName .getHeight .getWeight
    	//name count totalweight totalprice descriptoin
    	
    	String strg1 = "name1/1,0.0,0.0,desc1";
    	Equipment equip1 = new Equipment(strg1);
    	
    	String strg2 = "name2/2,0.0,0.0,desc2";
    	Equipment equip2 = new Equipment(strg2);
    	
    	Assert.assertEquals(equip1, equip1);
    	Assert.assertEquals(equip2, equip2);
    	
    }
    public void gettersTest()
    {
    	
    }
    public void toStringTest()
    {
    	String strg1 = "name1/1,0.0,0.0,desc1";
    	Equipment equip1 = new Equipment(strg1);
    	
    	Assert.assertEquals("Name: name1, Number: 1, Weight: 0.00 lbs, Price: $0.00 - desc1", equip1.toString());
    }
}

