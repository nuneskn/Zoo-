package solution;
/**
 * This is a class for Feline that extends Animal.
 *
 * @author Nicole Nunes
 * @version 2/24/19
 */
public abstract class Feline extends Animal
{
    /**
     * This is a constructor for Feline.
     *
     * @param myZoo is a Zoo object
     * @param name is a string
     */
    public Feline(Zoo myZoo, String name)
    {
        super(myZoo, name);
       
    }
    /**
     * This is a method for roam.
     */
    public void roam()
    {
        System.out.print("felines like to roam alone");
        setHungerLevel(getHungerLevel() + 1);
    }
}
