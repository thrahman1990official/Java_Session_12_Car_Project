package mypack2;

//count cars by color

public class MapDemoCarCounter
  {
  public static void main(String[] args)
    {
    //below are two constructors
     Car c1 = new Car(); //Object type is Car & object is c1
      c1.id = 20;
      c1.name = "tesla";
      c1.color = "blue";
    
     Car c2 = new Car(1, "hyundai", "red"); //Object type is Car & object is c2, id is 1, car name is hyundai, color is red
    }
  }
  
//default constructor = empty constructor vs parameterized constructor
class Car extends Machine
  {
  int id; //car manufacturing identification, the default for integer id will be zero
  String name; //car name, the default for string name will be null
  String color; //car color, the default for string name will be null
  
 //since they are two constructors, this is a concept of constructor overloading
  public Car()
    {
    System.out.println("inside default constructor");
    }
  
  public Car(int id, String name, String color) //creating constructor for car
    {
    super();
    this.id = id;
    this.name = name;
    this.color = color;
    }
  }

claas Machine
{
int machineId;
String manufacturingName;
}
