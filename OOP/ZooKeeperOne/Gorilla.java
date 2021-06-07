public class Gorilla extends Mammal{
    public throwSomething(){
        this.energy -= 5;
        System.out.println("Gorilla has thrown something, energy: " + this.energy);
    }
    public eatBananas(){
        this.energy -= 10;
        System.out.println("Gorilla has eaten a banana, energy: " + this.energy);
    }
    public climb(){
        this.energy -= 10;
        System.out.println("Gorilla has climbed something, energy: " + this.energy);
    }
}
