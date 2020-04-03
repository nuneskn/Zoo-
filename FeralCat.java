package solution;
/**
 * This is a class for FeralCat that extends Feline.
 *
 * @author Nicole Nunes
 * @version 2/24/19
 */
public class FeralCat extends Feline
{  
    /**
     * This is a constructor for FeralCat.
     *
     * @param myZoo is a zoo
     * @param name is a string
     */
    public FeralCat(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }
    /**
     * This is method for makeNoise.
     */
    public void makeNoise()
    {
        System.out.print("Meow...");
    }
    /**
     * This is a method for eat.
     */
    public void eat()
    {
        System.out.print("pick...");
        setHungerLevel(getHungerLevel() - 3);
    }
}
