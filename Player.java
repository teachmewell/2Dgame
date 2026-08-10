public class Player {
  public static int counter;
  public int id; 
  
  public Player(){
    this.id = static counter++;
  }

  public void sayHello() {
      System.out.println("Hello from Player No. " + this.variable);
  }
}
