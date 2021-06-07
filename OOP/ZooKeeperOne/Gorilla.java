public class Gorilla extends Mammal{
    public void throwSomething(){
        this.energy -= 5;
        System.out.println("Gorilla has thrown something, energy: " + this.energy);
    }
    public void eatBananas(){
        this.energy -= 10;
        System.out.println("Gorilla has eaten a banana, energy: " + this.energy);
    }
    public void climb(){
        this.energy -= 10;
        System.out.println("Gorilla has climbed something, energy: " + this.energy);
    }
}
