package solution;
/**
 * This is a class for WildDog that extends Canine.
 *
 * @author Nicole Nunes
 * @version 2/24/19
 */
public class WildDog extends Canine
{
    /**
     * This is a constructor for WildDog.
     *
     * @param myZoo is a Zoo object
     * @param name is a String
     */
    public WildDog(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }
    /**
     * This is a method for makeNoise.
     */
    public void makeNoise()
    {
        System.out.print("bark...");
    }
    /**
     * This is a method for eat.
     */
    public void eat()
    {
        System.out.print("slop...");
        setHungerLevel(getHungerLevel() - 3);
    }
}
