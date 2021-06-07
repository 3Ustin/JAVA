public class Samuri extends Human {
    public static int numberOSamuri = 0;
    Samuri(){
        this.health = 200;
        Samuri.numberOSamuri +=1;
    }
    public void deathBlow(Human human){
        human.health = 0;
        this.health = this.health/2;
    }
    public void meditate(){
        this.health += this.health/2;
    }
    public void howMany(){
        System.out.println(Samuri.numberOSamuri);
    }
}
