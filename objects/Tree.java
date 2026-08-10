public class Tree{
int health;

public Tree(){
this.health = 100;
}

public Tree(int healthToHave){
this.health = healthToHave;
}

public int steppedon(){
this.health = health -1;
if(health <= 0){
// Board.destruct();  //calls the Board class and lets it remove the tree
 }
}

}
