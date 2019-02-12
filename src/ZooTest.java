import org.junit.Assert;

public class ZooTest
{

    // TODO: test full constructor, getters, and toString
    public void constructorZooTest() throws AssertException
    {
       Zoo zoo1 = new Zoo(2);
       Zoo zoo2 = new Zoo(0);
       
   	Assert.assertEquals(zoo1, zoo1);
   	Assert.assertEquals(zoo2, zoo2);
    	
    }
	public void gettersZooTest()
    {
    	Zoo zoo1 = new Zoo(2);
        Animal animal1 = new Animal("purple", "Rosco", 10.0, 2.0);
        Animal animal2 = new Animal("pink", "Rosie", 10.0, 2.0);
        zoo1.addAnimal(animal1);
        zoo1.addAnimal(animal2);
        
    	//getTotalHeight
    	Assert.assertEquals(4.0, zoo1.getTotalHeight(), 0.05);
    	//getAverageWeight
    	Assert.assertEquals(10.0, zoo1.getAverageWeight(), 0.05);
    	//getAverageWeight (color)
    	Assert.assertEquals(10.0, zoo1.getAverageWeight("purple"), 0.05);
    	Assert.assertEquals(10.0, zoo1.getAverageWeight("pink"), 0.05);
    	//getCapacity
    	Assert.assertEquals(2, zoo1.getCapacity());
    }
    
    public void methodsZooTest()
    {
    	//expandZoo
    	
    	//addAnimal
    	
    }
    public void toStringZooTest()
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

