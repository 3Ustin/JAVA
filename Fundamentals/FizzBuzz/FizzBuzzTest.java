import javax.swing.text.html.Option;

public class FizzBuzzTest {
    public static String fizzyTest(int input){
        switch(input){
            case 2: return "2";
            case 3: return "Fizz";
            case 5: return "Buzz";
            case 15: return "FizzBuzz";
        }
        return "Not In The Buzz";
    }
}
