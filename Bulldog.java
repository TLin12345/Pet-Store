/**
  * @class name COP 3337
  * @author Tao Lin
  * @version (03/16/2021)  
  * @java version 14.0.2
  * The Bulldog class extends the Dog class, it add one additional instance variable,
  * and one additional method.
  */

public class Bulldog extends Dog
{  
   //instance variables
   private int sleepHours;
   
   //constructor for objects of class Bulldog
   public Bulldog(String breed, String name, int age, int weight,
                  int price, int sleepHours)
   {
       super(breed, name, age, weight, price);
       this.sleepHours = sleepHours;
   }
   
   
   //Getter methods for the object of class Labrador
   public int getSleepHours()
   {
       return sleepHours;
   }
   
   //Setter methods for the object of class Labrador
   public void setSleepHours(int sleepHours)
   {
       this.sleepHours = sleepHours;
   }
   
   //Override toString method into print specific information for the object of class Bulldog
   public String toString()
   {   
        return "Name: " + getName() + "  Type: " + getType() + "  Price: $" + getPrice() + "\n" + 
               getName() + " belongs to the breed of " + getBreed() + " and it is " + getAge() +
               " years old now\n" + getName() + "'s weight is " + getWeight() + " pounds " + 
               "and it likes to make " + makeSound() + " sound\n" + getName() + "'s favorite food is " +
               getFood() + "\n" + getName() + " sleeps about " + getSleepHours() + " hours a day"; 
   }

}