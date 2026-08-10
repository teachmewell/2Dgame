import java.lang.Math;
import objects.Tree;

public class Board{

int[][] board; //first is width, then height

public Board(int width, int height){
this.board = new int[width][height];
}

public void createEnvironment(){
  for (int height = 0; height < y.length; height++){
for(int width = 0; width < x.length(); width++){
if(Math.random()> 0.7){ this.board[width][height] = 1; }
}  
}
}


}
