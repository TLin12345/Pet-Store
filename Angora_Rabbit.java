/**
  * @class name COP 3337
  * @author Tao Lin
  * @version (03/16/2021)  
  * @java version 14.0.2
  * The Angora_Rabbit class extends the Rabbit class, it add one additional instance variable,
  * and one additional method. 
  */

public class Angora_Rabbit extends Rabbit
{
    //instance variables
    private String personality;
    
    //constructor for objects of class Angora_Rabbit
    public Angora_Rabbit(String breed, String name, int age, int weight,
                         int price, String personality)
    {   
        //use the super() method to call the base class Rabbit's constructor
        super(breed, name, age, weight, price);
        this.personality = personality;
    }
    
    
    //Getter methods for the object of class Angora_Rabbit
    public String getPersonality()
    {
        return personality;
    }
    
    //Setter methods for the object of class Angora_Rabbit
    public void setPersonality(String personality)
    {
        this.personality = personality;
    }
    
    //Override toString method into print specific information for the object of class Angora_Rabbit
    public String toString()
    {   
        return "Name: " + getName() + "  Type: " + getType() + "  Price: $" + getPrice() + "\n" + 
               getName() + " belongs to the breed of " + getBreed() + " and it is " + getAge() +
               " years old now\n" + getName() + "'s weight is " + getWeight() + " pounds " + 
               "and it likes to make " + makeSound() + " sound\n" + getName() + "'s favorite food is " +
               getFood() + "\n" + getName() + " has " + getPersonality() + " personality";
    }

}