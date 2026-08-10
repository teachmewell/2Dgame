import java.lang.Math;
import objects.Tree;
import objects.Rock;

public class Board{

int[][] treeBoard; //first is width, then height
int[][] rockBoard; //first is width, then height

  
public Board(int width, int height){
this.treeBoard = new Tree[width][height];
  this.rockBoard = new Rock[width][height];
}

public void createEnvironment(){
  for (int height = 0; height < y.length; height++){
for(int width = 0; width < x.length(); width++){
if(Math.random()> 0.7){ this.treeBoard[width][height] = new Tree(); }
}  
}
  
for (int height = 0; height < y.length; height++){
for(int width = 0; width < x.length(); width++){
  if(treeBoard[width][height] == null){
if(Math.random()> 0.7){ this.rockBoard[width][height] = new Rock(); }
}
}
}
}


}
