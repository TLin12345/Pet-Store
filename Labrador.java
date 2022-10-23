/**
  * @class name COP 3337
  * @author Tao Lin
  * @version (03/16/2021)  
  * @java version 14.0.2
  * The Labrador class extends the Retriever class, it add one additional instance variable,
  * and one additional method.
  */

public class Labrador extends Retriever
{
    //instance variables 
    private double height;
    
    //constructor for objects of class Labrador
    public Labrador(String breed, String name, int age, int weight,
                    int price, String gender, double height)
    {   
        //use the super() method to call the base class Labrador's constructor
        super(breed, name, age, weight, price, gender);
        this.height = height;
    }
    
    
    //Getter methods for the object of class Labrador
    public double getHeight()
    {
        return height;
    }
    
    //Setter methods for the object of class Labrador
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    //Override toString method into print specific information for the object of class Labrador
    public String toString()
    {   
        return "Name: " + getName() + "  Type: " + getType() + "  Price: $" + getPrice() + "\n" + 
               getName() + " belongs to the breed of " + getBreed() + " and it is " + getAge() +
               " years old now\n" + getName() + "'s weight is " + getWeight() + " pounds " + 
               "and it likes to make " + makeSound() + " sound\n" + getName() + "'s favorite food is " +
               getFood() + "\n" + getName() + "'s gender is " + getGender() + " and its height is " +
               getHeight() + " inches";
    }
    
}