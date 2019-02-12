import org.junit.Assert;

public class ZooTest
{

    // TODO: test full constructor, getters, and toString
    public void constructorTest() throws AssertException
    {
       Zoo zoo1 = new Zoo(2);
       Zoo zoo2 = new Zoo(0);
       
   	Assert.assertEquals(zoo1, zoo1);
   	Assert.assertEquals(zoo2, zoo2);
    	
    }
    public void gettersTest()
    {
    	
    }
    public void toStringTest()
    {
        Zoo zoo1 = new Zoo(2);
        Animal animal1 = new Animal("purple", "Rosco", 0.0, 0.0);
        Animal animal2 = new Animal("pink", "Rosie", 0.0, 0.0);
        zoo1.addAnimal(animal1);
        zoo1.addAnimal(animal2);
        
        Assert.assertEquals("These animals live in the zoo: \nRosco, a purple-colored animal. 0.0 pounds, 0.0 inches\n"
        		+ "Rosie, a pink-colored animal. 0.0 pounds, 0.0 inches\n", zoo1.toString());
    	
    }
}

