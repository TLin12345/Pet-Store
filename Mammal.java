/**
  * @class name COP 3337
  * @author Tao Lin
  * @version (03/16/2021)  
  * @java version 14.0.2
  * The Mammal interface can be implemented for the types of mammals, that is, Cat, Dog and Rabbit.
  * The Mammal interface has 3 method headers when implemented, it will updated an attribute in the 
  * implemented class.
  */


//Create an interface called Mammal
public interface Mammal
{
    //method headers
    String getType();////getType() method is to return the type of the mammal 
    String makeSound();//getWeight() method is to return the weight of the kind of mammal
    String getFood();//getEatFood() method is to return the food that the mammal eats
}    