package solution;
/**
 * This is a class for Dog that extends Canine.
 *
 * @author Nicole Nunes
 * @version 2/24/19
 */
public class Dog extends Canine implements Pet
{
    /**
     * This is a constructor for Dog.
     *
     * @param myZoo is a zoo
     * @param name is a string
     */
    public Dog(Zoo myZoo, String name)
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

    /**
     */
    @Override
    public void play()
    {
        System.out.println("Bork bork..");
    }

    /**
     */
    @Override
    public void beFriendly()
    {
        System.out.println("Lick lick...");
    }

}
