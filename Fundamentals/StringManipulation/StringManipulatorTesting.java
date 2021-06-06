public class StringManipulatorTesting {
    public static void main(String[] args){
        String one = StringManipulator.trimAndConcat("hello  ", "     world    ");
        System.out.println(one);

        char o = 'z';
        Integer two = StringManipulator.getIndexOrNull("hello  ", o);
        System.out.println(two);

        Integer three = StringManipulator.getIndexOrNull("hello","hell");
        System.out.println(three);

        String four = StringManipulator.concatSubstring("Hello There miss Winny", 5, 12, "OH NO!");
        System.out.println(four);
    }
}
