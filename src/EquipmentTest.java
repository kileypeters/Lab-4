import org.junit.Assert;

public class EquipmentTest
{

    // TODO: test full constructor, getters, and toString
    public void constructorEquipmentTest() throws AssertException
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
    public void gettersEquipmentTest()
    {
    	String strg1 = "name1/1,0.0,0.0,desc1";
    	Equipment equip1 = new Equipment(strg1);
    	//getName
    	Assert.assertEquals("name1", equip1.getName());
    	//getCount
    	Assert.assertEquals(1, equip1.getCount());
    	//getTotalWeight
    	Assert.assertEquals(0.0, equip1.getTotalWeight(), 0.05);
    	//getTotalPrice
    	Assert.assertEquals(0.0, equip1.getTotalPrice(), 0.05);
    	//getDescription
    	Assert.assertEquals("desc1", equip1.getDescription());
    	
    }
    public void toStringEquipmentTest()
    {
    	String strg1 = "name1/1,0.0,0.0,desc1";
    	Equipment equip1 = new Equipment(strg1);
    	
    	Assert.assertEquals("Name: name1, Number: 1, Weight: 0.00 lbs, Price: $0.00 - desc1", equip1.toString());
    }
}

