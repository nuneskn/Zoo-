package solution;
/**
 * This is a class for Hippo that extends Animal.
 *
 * @author Nicole Nunes
 * @version 2/24/19
 */
public class Hippo extends Animal
{
    /**
     * This is a constructor for Hippo.
     *
     * @param myZoo is a Zoo object
     * @param name is a string
     */
    public Hippo(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }
    /**
     * This is a method for makeNoise.
     */
    public void makeNoise()
    {
        System.out.print("blub...");
    }
    /**
     * This is a method for eat.
     */
    public void eat()
    {
        System.out.print("slurp...");
        setHungerLevel(getHungerLevel() - 1);
    }
}
