package solution;

/**
 * This is an abstract class for Canine.
 *
 * @author Nicole Nunes
 * @version 2/24/19
 */
public abstract class Canine extends Animal
{
   /**
    * This is a constructor for Canine.
    *
    * @param name is a string
    * @param myZoo is a Zoo object
    */ 
    public Canine(Zoo myZoo, String name)
    {
       super(myZoo, name);
    }
    /**
    * This is a method for roam.
    */
    public void roam()
    {
        System.out.print("like canines roam in packs");
        setHungerLevel(getHungerLevel() +  1);
    }
}
