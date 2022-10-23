/**
  * @class name COP 3337
  * @author Tao Lin
  * @version (03/16/2021) 
  * @java version 14.0.2
  * The Tester Class containing the main method that used to print the information stored and generated 
  * by the subclasses. The Polymorphism is used to create data structure as a ArrayList to hold the objects
  * that are used to generate the output for the program. The output includes the information stored in both 
  * the instance variables in the super() classes and the result of the comparison using the compareTo() method.
  */
  
import java.util.ArrayList;//import ArrayList to store the objects
import java.util.Scanner;//import Scanner method to input the type of pets
 
public class Tester
{  
   //Main method
   public static void main(String [] args)
   { 
      //ArrayList as a data structure that uses Polymorphism to hold the object of Cat 
      ArrayList<Cat> cat = new ArrayList<Cat>();
      cat.add(new Siamese("Siamese", "Lucky", 3, 12, 1500, "blue"));
      cat.add(new Tabby_Pointed_Siamese("Tabby Pointed Siamese", "Benji", 2, 9, 1200, "blue", true));
      cat.add(new Persian("Persian", "Cookie", 1, 8, 1000, "white"));
      cat.add(new British_Shorthairs("British Shorthairs", "Prince", 2, 8, 1500));
         
      //ArrayList as a data structure that uses Polymorphism to hold the object of Dog
      ArrayList<Dog> dog = new ArrayList<Dog>();
      dog.add(new Retriever("Retriever", "Toby", 2, 70, 3000, "male"));
      dog.add(new Labrador("Labrador", "Bella", 3, 65, 3300, "female", 23.5));
      dog.add(new Bulldog("Bulldog", "Peanut", 1, 50, 3000, 12));
      dog.add(new Chihuahua("Chihuahua", "Max", 2, 5, 2500));
         
      //ArrayList as a data structure that uses Polymorphism to hold the object of Rabbit
      ArrayList<Rabbit> rabbit = new ArrayList<Rabbit>();
      rabbit.add(new Angora_Rabbit("Angora Rabbit", "Ruby", 1, 7, 200, "gentle"));
      rabbit.add(new Giant_Angora_Rabbit("Giant Angora Rabbit", "Waffles", 2, 10, 300, "shy", 
                                         "Tauton Massachusetts"));
      rabbit.add(new French_Lop("French Lop", "Babe", 1, 9, 250, 5));    
      rabbit.add(new Alaska("Alaska", "Coco", 2, 10, 250)); 
         
      //Use Scanner to input the type of the object
      Scanner sc = new Scanner(System.in);
      System.out.println("----------------------------------------------------------------------");
      System.out.println("  Welcome to our pet store! We have cats, dogs and rabbits for sale.");
         
      boolean play = false;
      //This while loop is to ask if the user want to know more about the pet information
      while(!play)
      {
         System.out.print("             Do you want to know more about our pet? y/n ");
         String s = sc.next();
             
         //This while loop is to check if the user input correct character y or n
         while(!(s.equalsIgnoreCase("y")) && !(s.equalsIgnoreCase("n")))
         {
            System.out.print("                    Input error! please try again: ");
            s = sc.next();
         }
         
         if(s.equalsIgnoreCase("y"))
         {
            System.out.print("       Please choose the type of pet you want (cat/dog/rabbit): ");
            String n = sc.next();
            //while loop is to check if the user input the correct type of the message prompt
            while(!(n.equalsIgnoreCase("cat")) && !(n.equalsIgnoreCase("dog")) 
                    && !(n.equalsIgnoreCase("rabbit")))
            {  
               System.out.print("                   Input error! please try again: ");
               n = sc.next();
            }
               System.out.println();
                        
            //The if statement is to output the information of the object of class Cat      
            if(n.equalsIgnoreCase("cat"))
            {  
               System.out.println("                          Pet Information");
               System.out.println("----------------------------------------------------------------------");
           
               //Use the enhanced for loop to store value of the ArrayList<Cat>
               for(Cat c: cat)
               {  
                  //call toString method to output the information of object of class Cat
                  System.out.println(c.toString());
                  System.out.println();
               }//end for loop
             
               //This for loop is to output the result of the comparison using the compareTo() method
               for(int i = 1; i < cat.size(); i++)
               {  	   
  	               if(cat.get(0).compareTo(cat.get(i)) == 0) 
  	                  System.out.println(cat.get(0).getBreed() + " is the same price as " + cat.get(i).getBreed());
                  if(cat.get(0).compareTo(cat.get(i)) == -1)
                     System.out.println(cat.get(i).getBreed() + " costs more than " + cat.get(0).getBreed());
                  if(cat.get(0).compareTo(cat.get(i)) == 1)
                     System.out.println(cat.get(0).getBreed() + " costs more than " + cat.get(i).getBreed());
               }//end for loop
                  System.out.println("----------------------------------------------------------------------");                      
            }//end if
         
         
            //The if statement is to output the information of the object of class Dog
            if(n.equalsIgnoreCase("dog"))
            {
               System.out.println("                          Pet Information");
               System.out.println("----------------------------------------------------------------------");
             
               //Use the enhanced for loop to store value of the ArrayList<Dog>
               for(Dog d: dog)
               {   
                  //call toString method to output the information of object of class Dog
                  System.out.println(d.toString());
                  System.out.println();
               }//end for loop
             
               //This for loop is to output the result of the comparison using the compareTo() method
               for(int i = 1; i < dog.size(); i++)
               {  	   
  	               if(dog.get(0).compareTo(dog.get(i)) == 0) 
  	                  System.out.println(dog.get(0).getBreed() + " is the same price as " + dog.get(i).getBreed());
                  if(dog.get(0).compareTo(dog.get(i)) == -1)
                     System.out.println(dog.get(i).getBreed() + " costs more than " + dog.get(0).getBreed());
                  if(dog.get(0).compareTo(dog.get(i)) == 1)
                     System.out.println(dog.get(0).getBreed() + " costs more than " + dog.get(i).getBreed());         
               }//end for loop
                  System.out.println("----------------------------------------------------------------------");      
            }//end if
               
            //The if statement is to output the information of the object of class Rabbit
            if(n.equalsIgnoreCase("rabbit"))
            {   
               System.out.println("                          Pet Information");
               System.out.println("----------------------------------------------------------------------");
             
               //Use the enhanced for loop to store value of the ArrayList<Rabbit>
               for(Rabbit r: rabbit)
               {   
                  //call toString method to output the information of object of class Dog
                  System.out.println(r.toString());
                  System.out.println();
               }//end for loop
             
               //This for loop is to output the result of the comparison using the compareTo() method
               for(int i = 1; i < rabbit.size(); i++)
               {  	   
  	               if(rabbit.get(0).compareTo(rabbit.get(i)) == 0) 
  	                  System.out.println(rabbit.get(0).getBreed() + " is the same price as " + rabbit.get(i).getBreed());
                  if(rabbit.get(0).compareTo(rabbit.get(i)) == -1)
                     System.out.println(rabbit.get(i).getBreed() + " costs more than " + rabbit.get(0).getBreed());
                  if(rabbit.get(0).compareTo(rabbit.get(i)) == 1)
                     System.out.println(rabbit.get(0).getBreed() + " costs more than " + rabbit.get(i).getBreed());         
               }//end for loop 
                     System.out.println("----------------------------------------------------------------------");
            }//end if
         
         }//end while loop
         
         else
         { 
            System.out.println("                Thank you for coming! Have a good day!");
            play = true;   
         }//end if-else statement
         
      }//end while loop      

   }
     
}