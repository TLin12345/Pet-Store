/**
  * @class name COP 3337
  * @author Tao Lin
  * @version (03/16/2021)  
  * @java version 14.0.2
  * The Giant_Angora_Rabbit class extends the Angora_Rabbit class, it add one additional instance variable,
  * and one additional method. 
  */

public class Giant_Angora_Rabbit extends Angora_Rabbit
{
    //instance variables
    private String origin;
    
    //constructor for objects of class Angora_Rabbit
    public Giant_Angora_Rabbit(String breed, String name, int age, int weight, 
                               int price, String personality, String origin)
    {   
        //use the super() method to call the base class Rabbit's constructor
        super(breed, name, age, weight, price, personality);
        this.origin = origin;
    }
    
    
    //Getter methods for the object of class Angora_Rabbit
    public String getOrigin()
    {
        return origin;
    }
    
    //Setter methods for the object of class Angora_Rabbit
    public void setOrigin(String origin)
    {
        this.origin = origin;
    }
    
    //Override toString method into print specific information for the object of class Angora_Rabbit
    public String toString()
    {   
        return "Name: " + getName() + "  Type: " + getType() + "  Price: $" + getPrice() + "\n" + 
               getName() + " belongs to the breed of " + getBreed() + " and it is " + getAge() +
               " years old now\n" + getName() + "'s weight is " + getWeight() + " pounds " + 
               "and it likes to make " + makeSound() + " sound\n" + getName() + "'s favorite food is " +
               getFood() + "\n" + getName() + " has " + getPersonality() + " personality\n" + 
               getBreed() + " was originated in " + getOrigin();
    }
    
}