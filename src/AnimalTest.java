import org.junit.Assert;

/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    public void constructorTest() throws AssertException
    {
       // .getColor .getName .getHeight .getWeight
    	//String color, String name, double weight, double height
    	
    	String color1 = "blue";
    	String name1 = "name";
    	double weight1 = 0.0;
    	double height1 = 0.0;
    	Animal animal1 = new Animal(color1, name1, weight1, height1);
    	
    	String color2 = "blue";
    	String name2 = "name";
    	double weight2 = 0.0;
    	double height2 = 0.0;
    	Animal animal2 = new Animal(color2, name2, weight2, height2);
    	
    	Assert.assertEquals(animal1, animal1);
    	Assert.assertEquals(animal2, animal2);
    	
    }
    public void gettersTest()
    {
    	
    }
    public void toStringTest()
    {
    	String color1 = "blue";
    	String name1 = "name";
    	double weight1 = 0.0;
    	double height1 = 0.0;
    	Animal animal1 = new Animal(color1, name1, weight1, height1);
    	
    	Assert.assertEquals("name, a blue-colored animal. 0.0 pounds, 0.0 inches\n", animal1.toString());
    }
}

