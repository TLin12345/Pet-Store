/**
  * @class name COP 3337
  * @author Tao Lin
  * @version (03/16/2021)  
  * @java version 14.0.2
  * The abstract class Rabbit implements the Mammal and Comparable<T> interfaces. It contains 5 attributes
  * and getter and setter methods that will be inherited in the extended classes. The method that declared
  * in the Mammal interface and the Comparable<T> interface will be implemented in the abstract class Rabbit
  */

public abstract class Rabbit implements Mammal, Comparable<Rabbit>
{
    //instance variables
    private String breed;
    private String name;
    private int age;
    private int weight;
    private int price;
    private String type;
    private String sound;
    private String food;
    
    //default constructor for the object of class Rabbit
    public Rabbit()
    {
        //initialise instance variables
        type = "Rabbit";
        sound = "clucking";
        food = "carrot"; 
    }
    
    //constructor for the object of class Rabbit
    public Rabbit(String breed, String name, int age, int weight, int price)
    {   
        //initialise instance variables
        this();
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.price = price;
    }
    
    
    //implementing the methods of Mammal interface and provides the implementation
    public String getType()
    {
        return type;
    }
    
    public String makeSound()
    {
        return sound;
    }
    
    public String getFood()
    {   
        return food;
    }
    
    //Getter methods for the abstract class Dog
    public String getBreed()
    {
       return breed;
    }
    
    public String getName()
    {
       return name;
    }
    
    public int getAge()
    {
       return age;
    }
    
    public int getWeight()
    {
       return weight;
    }
    
    public int getPrice()
    {
       return price;
    }
    
    //Setter methods for the abstract class Dog    
    public void setBreed(String breed)
    {
       this.breed = breed;
    }
    
    public void setName(String name)
    {
       this.name = name;
    }
    
    public void setAge(int age)
    {
       this.age = age;
    }
    
    public void setWeight(int weight)
    {
       this.weight = weight;
    }
    
    public void setPrice(int price)
    {
       this.price = price;
    }
    
    //default toString method
    public String toString()
    {
       return "Name: " + getName() + "  Type: " + getType() + "  Price: $" + getPrice() + "\n" + 
               getName() + " belongs to the breed of " + getBreed() + " and it is " + getAge() +
              " years old now\n" + getName() + "'s weight is " + getWeight() + " pounds " + 
              "and it likes to make " + makeSound() + " sound\n" + getName() + "'s favorite food is " +
               getFood() + "\n";
    }
    
    /* implementing the methods of Comparable<T> and have
     * a compareTo() method to compare the price of different breeds of Rabbit
     */
    public int compareTo(Rabbit rabbit)
    {  
       if(price < rabbit.price){
           return -1;
       }else if(price == rabbit.price){
           return 0;
       }else{
           return 1;
       }//end if-else statement
    }
   
}