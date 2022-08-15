package mypack2;

//count cars by color

public class MapDemoCarCounter
  {
  public static void main(String[] arg)
    {
    //below are two constructors
     Car c1 = new Car(); //Object type is Car & object is c1
     Car c2 = new Car(1, "hyundai", "red"); //Object type is Car & object is c2
    }
  }
  
class Car
  {
  int id; //car manufacturing identification
  String name; //car name
  String color; //car color
  
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
