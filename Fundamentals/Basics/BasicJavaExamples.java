import java.lang.reflect.Array;

public class BasicJavaExamples {
    public void printOneToTwoFiftyFive(){
        for(int i = 0; i <= 255; i++){
            System.out.println(i);
        }
    }
    public void printOddToTwoFiftyFive(){
        for(int i = 1; i <=255; i +=2){
            System.out.println(i);
        }
    }
    public void printSumToTwoFiftyFive(){
        int sum = 0;
        for(int i =0; i<=255; i++){
            sum += i;
        }
        System.out.println(sum);
    }
    public void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public int findMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public void getAverage(int[] average){
        int sum = 0;
        int avg;
        for(int i = 0; i < average.length;i++){
            sum+=average[i];
        }
        avg = sum/average.length;
        System.out.println(avg);
    }
    public ArrayList arrayOddToTwoFiftyFive(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 1; i<255;i+=2){
            arr.add(i);
        }
        return arr;
    }
    public int greaterThanY(int[] arr, int Y){
        int num = 0;
        for(int i = 0; i <arr.length; i++){
            if(arr[i] > Y){
                num +=1;
            }
        }
        return num;
    }
    public int[] squareArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] *= arr[i];
        }
        return arr;
    }
    public int[] eliminateNegNumbers(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        return arr;
    }
    public int[] maxMinAvg(int[] arr){
        int[] mma = new int[3];
        int max = arr[0];
        int avg = arr[0];
        int sum = 0;
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
            sum += arr[i];
        }
        avg = sum/arr.length;
        mma[0] = max;
        mma[1] = min;
        mma[2] = avg;
        return mma;
    }
    public int[] shiftingArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(i+1 == arr.length){
                arr[i] = 0;
            }
            else{
                arr[i] = arr[i+1];
            }
        }
        return arr;
    }
}
