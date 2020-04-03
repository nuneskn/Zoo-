package solution;
/**
 * This is a class for Wolf that extends Canine.
 *
 * @author Nicole Nunes
 * @version 2/24/19
 */
public class Wolf extends Canine
{
    /**
     * This is a constructor for Wolf.
     *
     * @param myZoo is a Zoo object
     * @param name is String
     */
    public Wolf(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }
    /**
     * This is a method for makeNoise.
     */
    public void makeNoise()
    {
        System.out.print("growl...");
    }
    /**
     * This is a method for eat.
     */
    public void eat()
    {
        System.out.print("rip with teeth...");
        setHungerLevel(getHungerLevel() - 2);
    }
}
