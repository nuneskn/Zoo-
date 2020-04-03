package solution;
/**
 * This is an interface called AnimalLocation.
 * 
 * @author Nicole Nunes
 * @version 2/24/19
 */
public interface AnimalLocation 
{
    /**
     * This is an abstract method for getName.
     * @return String
     */
    String getName();
    /**
     * This is a setter for Name.
     * @param locName is a string
     */
    void setName(String locName);
    /**
     * This is a method for get NumOfAnimals
     * @return int
     */
    int getNumOfAnimals();
}

