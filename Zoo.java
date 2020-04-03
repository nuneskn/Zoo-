package solution;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * This an class for Zoo that implements AnimalLocation.
 *
 * @author Nicole Nunes
 * @version 2/24/19
 */
public class Zoo implements AnimalLocation
{
    private String name;
    private double latitude;
    private double longitude;
    private ArrayList<Animal> zooAnimals;
   
    /**
     * This is a constructor for Zoo.
     *
     * @param name is a string
     * @param lat is a double
     * @param lon is a double
     */
    public Zoo(String name, double lat, double lon)
    {
        this.name = name;
        latitude = lat;
        longitude = lon;
        zooAnimals = new ArrayList<Animal>();
    }
    /**
     * This is a getter for Latitude.
     *
     * @return double 
     */
    public double getLatitude()
    {
        return this.latitude;
    }
    /**
     * This is a getter for Longitude.
     *
     * @return double
     */
    public double getLongitude()
    {
        return this.longitude;
    }
   /**
    * This is a setter for setName.
    *
    * @param name is a String
    */
    public void setName(String name)
    {
        this.name = name;
    }
   /**
    * This is a getter for getName.
    *
    * @return String
    */
    public String getName()
    {
        return this.name;
    }
   /**
    * This is a method for getNumOfAnimals.
    *
    * @return int
    */
    public int getNumOfAnimals()
    {
        return zooAnimals.size();
    }
    /**
     * This is a method to add an Animal.
     *
     * @param animal is an Animal object
     */
    public void addAnimal(Animal animal)
    {
        zooAnimals.add(animal);
    }
    /**
     * This is a method that tests Animals.
     */
    public void testAnimals()
    {
        System.out.println(name + "\n" + getLatitude()
                           + "\n" + getLongitude() 
                           + "\n" + getNumOfAnimals() 
                           + "\n");
        for (Animal i: zooAnimals)
        {
            i.sleep();
            i.makeNoise();
            i.eat();
            i.roam();
        }
    }
    /**
     * This is the main method for Zoo.java.
     *
     * @param args is the command
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Animal Choices: ");
        System.out.print("Dog\n" + "Cat\n" + "Wolf\n" + "Coyote\n" + "Lion\n" + "Feral Cat\n" + "WildDog\n" + "Hippo\n");
        
        
        
        System.out.println("Choose an animal :)");
        
        String animalChoice = sc.nextLine();

        
        
        Zoo zoo = new Zoo("name", 20.0, 20.0);
        Dog doggo = new Dog(zoo, "Dogdge");
        Cat catto = new Cat(zoo, "Cleo");
        Wolf wolfo = new Wolf(zoo, "Wolfy");
        Coyote coyoto = new Coyote(zoo, "Cody");
        Lion liono = new Lion(zoo, "Leo");
        FeralCat feralCato = new FeralCat(zoo, "Spook");
        WildDog wildDoggo = new WildDog(zoo, "Willy");
        Hippo hippo = new Hippo(zoo, "Hippy");

    }
}



