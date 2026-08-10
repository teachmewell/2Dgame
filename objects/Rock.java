package objects;

public class Rock{
int health;

public Rock(){
this.health = 100;
}

public Rock(int healthToHave){
this.health = healthToHave;
}

public int steppedon(){
this.health = health -1;
if(health <= 0){
// Board.destruct();  //calls the Board class and lets it remove the tree
return 0; 
}
 return 1:
}

}
