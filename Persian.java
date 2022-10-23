/**
  * @class name COP 3337
  * @author Tao Lin
  * @version (03/16/2021)  
  * @java version 14.0.2
  * The Persian class extends the Cat class, it add one additional instance variable,
  * and one additional method. 
  */

public class Persian extends Cat
{   
    //instance variables
    private String hairColor;
    
    //constructor for objects of class Siamese
    public Persian(String breed, String name, int age, int weight, int price, String hairColor)
    {   
        //use the super() method to call the base class Cat's constructor
        super(breed, name, age, weight, price);
        this.hairColor = hairColor;
    }
    
    
    //Getter methods for the object of class Persian
    public String getHairColor()
    {
        return hairColor;
    }
    
    //Setter methods for the object of class Persian
    public void setHairColor(String hairColor)
    {
        this.hairColor = hairColor;
    }
    
    //Override toString method into print specific information for the object of class Persian
    public String toString()
    {   
        return "Name: " + getName() + "  Type: " + getType() + "  Price: $" + getPrice() + "\n" + 
               getName() + " belongs to the breed of " + getBreed() + " and it is " + getAge() +
               " years old now\n" + getName() + "'s weight is " + getWeight() + " pounds " + 
               "and it likes to make " + makeSound() + " sound\n" + getName() + "'s favorite food is " + 
               getFood() + "\n" + getName() + " has a " + getHairColor() + " hair color";
    }
    
}