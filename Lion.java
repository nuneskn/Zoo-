package solution;
/**
 * This is a class for Lion that extends Feline.
 *
 * @author Nicole Nunes
 * @version 2/24/19
 */
public class Lion extends Feline
{
    /**
     * This is a constructor for Lion.
     *
     * @param myZoo is a Zoo object
     * @param name is a string
     */
    public Lion(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }
    /**
     * This a method for makeNoise.
     */
    public void makeNoise()
    {
        System.out.print("roar...");
    }
    /**
     * This is am method for eat.
     */
    public void eat()
    {
        System.out.print("rip with teeth...");
        setHungerLevel(getHungerLevel() - 2);
    }

}

