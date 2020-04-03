package solution;
/**
 * 
 * @author Nicole Nunes
 * @version 2/24/19
 *
**/
public abstract class Animal
{
    private String name;
    private Zoo zooName;
    private int hungerLevel;
    
    /**
     * This is a constructor to create Animal. 
     *
     * @param myZoo is a zoo object
     * @param animalName is a string
    **/
    public Animal(Zoo myZoo, String animalName)
    {
        zooName = myZoo;
        name = animalName;
        hungerLevel = 0;
    }
    /**
     *This is a getter to get HungerLevel. 
     *
     * @return int
    **/
    public int getHungerLevel()
    {
        return this.hungerLevel;
    }
    /**
     *This is a setter for hungerLevel.
     *
     *@param hunger is an int
     */ 
    public void setHungerLevel(int hunger)
    {
        if (hunger > 10)
        {
            this.hungerLevel = 10;
        }
        else if (hunger < 0)
        {
            this.hungerLevel = 0;
        }
        else
        {
            this.hungerLevel = hunger;
        }
    }
    /**
     *This is a getter for name.
     *
     * @return String
     */ 
    public String getName()
    {
        return this.name;
    }
    /**
     * This is a setter for animalName.
     *
     * @param animalName is a string
     */
    public void setName(String animalName)
    {
        this.name = animalName;
    }
    /**
     * This is a setter for sleep.            
     */
    public void sleep()
    {
        System.out.println("Sleeping");
        setHungerLevel(10);
    }
    /**
     * This is a setter for roam.
     */
    public void roam()
    {
        System.out.println("moving around...");
        setHungerLevel(getHungerLevel() + 1);
    }
    /**
     */
    public abstract void makeNoise();
    /**
     */
    public abstract void eat();
}




