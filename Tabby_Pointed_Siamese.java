/**
  * @class name COP 3337
  * @author Tao Lin
  * @version (03/16/2021)  
  * @java version 14.0.2
  * The Tabby_Pointed_Siamese class extends the Siamese class, it add one additional instance variable,
  * and one additional method. 
  */

public class Tabby_Pointed_Siamese extends Siamese
{
    //instance variables
    private boolean isSubspecies;
    
    //constructor for objects of class Siamese
    public Tabby_Pointed_Siamese(String breed, String name, int age, int weight, 
                                 int price, String eyesColor, boolean isSubspecies)
    {   
        //use the super() method to call the base class Siamese's constructor
        super(breed, name, age, weight, price, eyesColor);
        this.isSubspecies = isSubspecies;
    }
    
    
    //Getter methods for the object of class Tabby_Pointed_Siamese
    public boolean isSubspecies()
    {
        return isSubspecies;
    }
    
    //Setter methods for the object of class Tabby_Pointed_Siamese
    public void setSubspecies(boolean isSubspecies)
    {
        this.isSubspecies = isSubspecies;
    }
    
    //Override toString method into print specific information for the object of class Tabby_Pointed_Siamese
    public String toString()
    {   
        //the if statement is to check whether the Tabby_Pointed_Siamese is the subspecies of Siamese
        if(isSubspecies){
           return  "Name: " + getName() + "  Type: " + getType() + "  Price: $" + getPrice() + "\n" + 
                   getName() + " belongs to the breed of " + getBreed() + " and it is " + getAge() +
                   " years old now\n" + getName() + "'s weight is " + getWeight() + " pounds " + 
                   "and it likes to make " + makeSound() + " sound\n" + getName() + "'s favorite food is " +
                   getFood() + "\n" + getName() + " has a " + getEyesColor() + " color of eyes\n" + 
                   getName() + " is a subspecies of Siamese";
        }
           return  "Name: " + getName() + "  Type: " + getType() + "  Price: $" + getPrice() + "\n" + 
                   getName() + " belongs to the breed of " + getBreed() + " and it is " + getAge() +
                   " years old now\n" + getName() + "'s weight is " + getWeight() + " pounds " + 
                   "and it likes to make " + makeSound() + " sound\n" + getName() + "'s favorite food is " +
                   getFood() + "\n" + getName() + " has a " + getEyesColor() + " color of eyes\n" +  
                   getName() + " is not a a subspecies of Siamese";
    }

}

