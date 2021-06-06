import java.lang.reflect.Arrays;

import BasicJavaExamples;
public class BasicJava {
    public static void main(String[] args){
        BasicJavaExamples func = new BasicJavaExamples();
        func.printOneToTwoFiftyFive();
        func.printOddToTwoFiftyFive();
        func.printSumToTwoFiftyFive();
        int[] arr = {1,2,3,4,5,6};
        func.printArray(arr);
        System.out.println(func.findMax(arr));
        func.getAverage(arr);
        //System.out.println(java.util.Arrays.toString(func.arrayOddToTwoFiftyFive(arr))); //Array lists don't seem to be working for me.
        System.out.println(func.greaterThanY(arr, 5));
        System.out.println(java.util.Arrays.toString(func.squareArray(arr)));
        System.out.println(java.util.Arrays.toString(func.eliminateNegNumbers(arr)));
        System.out.println(java.util.Arrays.toString(func.maxMinAvg(arr)));
        System.out.println(java.util.Arrays.toString(func.shiftingArray(arr)));
    }
}
