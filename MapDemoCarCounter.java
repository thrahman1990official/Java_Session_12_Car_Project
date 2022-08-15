package mypack2;

//count cars by color

public class MapDemoCarCounter
  {
  public static void main(String[] args)
    {    
     Car c1 = new Car(1, "hyundai", "red"); //Object type is Car & object is c2, id is 1, car name is hyundai, color is red
      Car c2 = new Car(2, "kia", "red");
    }
  }
  
//default constructor is provided by default = empty constructor vs parameterized constructor
class Car extends Machine //for the car class, machine is the super-class
  {
  int id; //car manufacturing identification, the default for integer id will be zero
  String name; //car name, the default for string name will be null
  String color; //car color, the default for string name will be null
  
 //since they are two constructors, this is a concept of constructor overloading
  public Car()
    {
    super();
    System.out.println("inside default constructor of car class");
    }
  
  public Car(int id, String name, String color) //creating constructor for car
    {
    super();
    System.out.println("inside fully paramterized constructor of car class");
    this.id = id;
    this.name = name;
    this.color = color;
    }
  }

class Machine extends Object
{
int machineId;
String manufacturingName;
  public Machine()
    {
    super();
    System.out.println("inside default constructor of Machine");
    }
}


//Interview questions that can be asked. 
//What's constructor? What's constructor over-loading? What's constructor chaining?
//What is super()?
