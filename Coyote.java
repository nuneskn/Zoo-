package solution;

/**
 * This is a class for Coyote that extends Canine.
 *
 * @author Nicole Nunes
 * @version 2/29/19
 */
public class Coyote extends Canine
{
    /**
     * This is a constructor for Coyote.
     *
     * @param myZoo is a Zoo object
     * @param name is a String
     */
    public Coyote(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }
    /**
     * This a method for makeNoise.
     */
    public void makeNoise()
    {
        System.out.println("Howls");
    }
    /**
     * This a method for eat.
     */
    public void eat()
    {
        System.out.println("gnaws...");
        setHungerLevel(getHungerLevel() - 2);
    }
}
