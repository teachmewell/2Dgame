public class Main {

    
public static void main(String[] args) {
Board board = new Board(1000, 1000);
board.createEnvironment();

    //step 2: 
    Player player1 = new Player();
Player player2 = new Player(); //create two objects of TYPE Player. 

        player1.healthminus(500); //do a method on ONE OF THE OBJECTS only. 

    if(player2.healthminus(700) == 0){ //you can use the return values to check if healthminus killed a player
        return; // end the program if you lost
    } 

    System.out.println( player1.getHealth() ); // you can use the int return value of a method as though it were an int itself. 

     if(player1.healthminus(700) == 0){ //you can use the return values to check if healthminus killed a player
        return; //the program ends here because you have a return.  
    } 
    
    }
}
