import org.junit.Assert;

public class EquipmentTest
{

    // TODO: test full constructor, getters, and toString
    public void constructorEquipmentTest() throws AssertException
    {
    	//Create an equipment object
    	String strg1 = "name1/1,0.0,0.0,desc1";
    	Equipment equip1 = new Equipment(strg1);
    	//Create an equipment object
    	String strg2 = "name2/2,0.0,0.0,desc2";
    	Equipment equip2 = new Equipment(strg2);
    	
    	Assert.assertEquals(equip1, equip1);
    	Assert.assertEquals(equip2, equip2);
    	
    }
    public void gettersEquipmentTest()
    {
    	//Create an equipment object
    	String strg1 = "name1/1,0.0,0.0,desc1";
    	Equipment equip1 = new Equipment(strg1);
    	
    	//Test getName()
    	Assert.assertEquals("name1", equip1.getName());
    	//Test getCount()
    	Assert.assertEquals(1, equip1.getCount());
    	//Test getTotalWeight()
    	Assert.assertEquals(0.0, equip1.getTotalWeight(), 0.05);
    	//Test getTotalPrice()
    	Assert.assertEquals(0.0, equip1.getTotalPrice(), 0.05);
    	//Test getDescription()
    	Assert.assertEquals("desc1", equip1.getDescription());
    	
    }
    public void toStringEquipmentTest()
    {
    	//Create equipment object
    	String strg1 = "name1/1,0.0,0.0,desc1";
    	Equipment equip1 = new Equipment(strg1);
    	//test toString()
    	Assert.assertEquals("Name: name1, Number: 1, Weight: 0.00 lbs, Price: $0.00 - desc1", equip1.toString());
    }
    public void equalsEquipmentTest()
    {
    	//Create equipment object
    	String strg1 = "name1/1,0.0,0.0,desc1";
    	Equipment equip1 = new Equipment(strg1);
    	//create equipment object
    	String strg2 = "name1/1,0.0,0.0,desc1";
    	Equipment equip2 = new Equipment(strg2);
    	//Test equals()
    	Assert.assertEquals(true, equip1.equals(equip2));
    }
}

