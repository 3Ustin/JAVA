public class HumanTest {
    public static void main(String[] args){
        Human one = new Human();
        Human two = new Human();

        one.attack(two);
        System.out.println(two.health);
    }
}
