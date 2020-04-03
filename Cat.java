package solution;
/**
 * This is a class for cat that extends Feline.
 *
 * @author Nicole Nunes
 * @version 2/24/19
 */
public class Cat extends Feline implements Pet
{
    /**
     * This is a constructor for Cat.
     *
     * @param myZoo is a Zoo object
     * @param name is a String
     */
    public Cat(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }
    /**
     * This is a method for makeNoise.
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
    /**
     */
    @Override
    public void beFriendly()
    {
        System.out.println("purr...");
    }

    /**
     */
    @Override
    public void play()
    {
        System.out.println("frolic..");
    }
}
