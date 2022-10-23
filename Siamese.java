/**
  * @class name COP 3337
  * @author Tao Lin
  * @version (03/16/2021)  
  * @java version 14.0.2
  * The Siamese class extends the Cat class, it add one additional instance variable,
  * and one additional method. 
  */

public class Siamese extends Cat
{   
    //instance variables that unique to the concrete class Siamese
    private String eyesColor;
    
    //constructor for objects of class Siamese
    public Siamese(String breed, String name, int age, int weight, int price, String eyesColor)
    {   
        //use the super() method to call the base class Cat's constructor
        super(breed, name, age, weight, price);
        this.eyesColor = eyesColor;
    }
    
    
    //Getter methods for the object of class Siamese
    public String getEyesColor()
    {
        return eyesColor;
    }
    
    //Setter methods for the object of class Siamese
    public void setEyesColor(String eyesColor)
    {
        this.eyesColor = eyesColor;
    }
    
    //Override toString method into print specific information for the object of class Siamese
    public String toString()
    {   
        return "Name: " + getName() + "  Type: " + getType() + "  Price: $" + getPrice() + "\n" + 
               getName() + " belongs to the breed of " + getBreed() + " and it is " + getAge() +
               " years old now\n" + getName() + "'s weight is " + getWeight() + " pounds " + 
               "and it likes to make " + makeSound() + " sound\n" + getName() + "'s favorite food is " +
               getFood() + "\n" + getName() + " has a " + getEyesColor() + " color of eyes";
    }

}