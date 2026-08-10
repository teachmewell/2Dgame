import java.lang.Math;
import objects.Tree;

public class Board{

int[][] treeBoard; //first is width, then height

  
public Board(int width, int height){
this.treeBoard = new int[width][height];
}

public void createEnvironment(){
  for (int height = 0; height < y.length; height++){
for(int width = 0; width < x.length(); width++){
if(Math.random()> 0.7){ this.treeBoard[width][height] = 1; }
}  
}

}


}
