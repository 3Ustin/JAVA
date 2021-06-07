public class Ninja extends Human{
    Ninja(){
        this.stealth = 10;
    }
    public void steal(Human human){
        human.health -= this.stealth;
        this.health += this.stealth;
    }
    public void runAway(Human human){
        human.health -= 10;
    }
}
