// Intro step 2

// This defines the class itself. the two / are comments and will be ignored when running. 

//every Class is defined with the keyword "class" + Name  and {}brackets that encompass all things defined inside it. 
// CLASS DECLARATION
class Player {

  // Remember the end goal of our class: to be able to spawn many objects which have the same functionality.

  // 1. You can define attributes each class object has. Here you can see that EACH OBJECT of this class will have an attribute named id that has TYPE int.  Note that you do not need assign values here yet. 
  // 2. public static are the descriptions of this attribute.  public/private affects whether OTHER classes can SEE/MODIFY it.  IF you add the keyword static, this attribute is SHARED with all other objects. 
  // ATTRIBUTES EACH OBJECT CREATED FROM THIS CLASS HAS
  public static int counter = 0;
  public int id; 
  public int health;

  // A CONSTRUCTOR is defined as  the method whose NAME is EQUAL to that of the class. Calling this method will create a new instance of the class. 
  // the "this" keyword refers to the object itself.  See what I mean below.
  // CONSTRUCTOR; AKA WHAT HAPPENS WHEN YOU CREATE A NEW OBJECT OF THIS CLASS
  public Player(){
    this.id = static counter++;
    this.health = 1000;
  }

  // 3. These are methods. Methods are always called BY OBJECTS.  So what I define here will be called in reality with "OBJECT.healthminus(10);"
  //That means that each method (with exception of static methods) have ONE object they Refer to. That object is the "this". 
  // So if I do "this.health = health - damage;" here, it refers ONLY to the health attribute of this object, not to all. 
  // Mthod parameters are similar as those with attributes. the public means that all other classes can call this method, the int part means that the return value of the method will be an int. 
  //Methods can have inputs, like here in form of damage. This means that whoever calls the method will input an int value when calling it. 
// METHODS OF THE CLASS; AKA WHAT EVERY MEMBER OF THIS CLASS CAN DO
  public int healthminus(int damage){
this.health = health - damage; 

  //the if statement : if(condition){then do xy}  else{do something if not} . else part can be not written. 
  if(this.health <=0){
    System.out.println("You Lost");

    //here you can see the return value. Once a method returns, all code below it will be disregarded. 
    return 0;
  } else{ return 1; }

  System.out.println("This will never be printed, beause I returned beforehand already");
}

  // ANOTHER METHOD
  public void sayHello() {
      System.out.println("Hello from Player No. " + this.id);
  }
}

public int getHealth(){
  return this.health;
}

//using this knowledge, you can now know how to write code such that every member inside the class can do something. 
// To create an object, the main Method will use the keyword new to make one. (example: Player name = new Player(); )  the first Player is a type, as seen by it not having (). We assign name to be the pointer to our new Player() object. 
