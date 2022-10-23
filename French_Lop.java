/**
  * @class name COP 3337
  * @author Tao Lin
  * @version (03/16/2021)  
  * @java version 14.0.2
  * The French_Lop class extends the Rabbit class
  */

public class French_Lop extends Rabbit
{  
   //instance variables
   private int lifespan;
   
   //constructor for objects of class French_Lop
   public French_Lop(String breed, String name, int age, int weight, int price, int lifespan)
   {
       super(breed, name, age, weight, price);
       this.lifespan = lifespan;
   }
 
   
   //Getter methods for the object of class French_Lop
   public int getLifeSpan()
   {
       return lifespan;
   }
   
   //Setter methods for the object of class French_Lop
   public void setLifeSpan(int lifespan)
   {
       this.lifespan = lifespan;
   }
   
   //Override toString method into print specific information for the object of class French_Lop
   public String toString()
   {   
        return "Name: " + getName() + "  Type: " + getType() + "  Price: $" + getPrice() + "\n" + 
               getName() + " belongs to the breed of " + getBreed() + " and it is " + getAge() +
               " years old now\n" + getName() + "'s weight is " + getWeight() + " pounds " + 
               "and it likes to make " + makeSound() + " sound\n" + getName() + "'s favorite food is " +
               getFood() + "\n" + getBreed() + "'s average lifespan is only " + getLifeSpan() + " years";
   }

}