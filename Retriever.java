/**
  * @class name COP 3337
  * @author Tao Lin
  * @version (03/16/2021)  
  * @java version 14.0.2
  * The Retriever class extends the Dog class, it add one additional instance variable,
  * and one additional method.
  */

public class Retriever extends Dog
{
    //instance variables
    private String gender;
    
    //constructor for objects of class Retriever
    public Retriever(String breed, String name, int age, int weight, int price,
                     String gender)
    {   
        //use the super() method to call the base class Dog's constructor
        super(breed, name, age, weight, price);
        this.gender = gender;
    }
    
    
    //Getter methods for the object of class Retriever
    public String getGender()
    {
        return gender;
    }
    
    //Setter methods for the object of class Retriever
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    
    //Override toString method into print specific information for the object of class Retriever
    public String toString()
    {   
        return "Name: " + getName() + "  Type: " + getType() + "  Price: $" + getPrice() + "\n" + 
               getName() + " belongs to the breed of " + getBreed() + " and it is " + getAge() +
               " years old now\n" + getName() + "'s weight is " + getWeight() + " pounds " + 
               "and it likes to make " + makeSound() + " sound\n" + getName() + "'s favorite food is " +
               getFood() + "\n" + getName() + "'s gender is " + getGender();
    }
    
}