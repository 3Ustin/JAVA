public class Bat extends Mammal{
    Bat(){
        this.energy = 300;
    }
    public void fly(){
        this.energy -= 50;
        System.out.println("Bat has taken off, energy: " + this.energy);
    }
    public void eatHumans(){
        this.energy += 25;
        System.out.println("Bat has done the unthinkable, energy: " + this.energy);
    }
    public void attackTown(){
        this.energy -= 100;
        System.out.println("Bat has destroyed a town, energy: " + this.energy);
    }
}
