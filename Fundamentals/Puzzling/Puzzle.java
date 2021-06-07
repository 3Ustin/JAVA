import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Puzzle {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};

    }
    public static ArrayList<Integer> eliminateLessThanTen(int[] arr){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i = 0; i< arr.length;i++){
            if(arr[i] > 10){
                newArr.push(arr[i]);
            }
        }
        return newArr;
    }
    public static ArrayList<String> nameslessThanFive(String[] arr){
        ArrayList<String> newArr = new ArrayList<String>();
        for(int i = 0; i< arr.length;i++){
            if(arr[i].length() < 5){
                newArr.push(arr[i]);
            }
        }
        return newArr;
    }
    public static ArrayList<String> shuffle(ArrayList<String> arr){
        Collections.shuffle(arr);
        System.out.println("First: " + arr.get(0) + "Last: " + arr.get(arr.size());
        if(arr.get(0) == "a" || arr.get(0) == "e" || arr.get(0) == "i" || arr.get(0) == "o" || arr.get(0) == "u" || arr.get(0) == "y"){
            System.out.println("Vowels!");
        }
    }
    public static int[] randomInt(){
        int[] arr = new arr[10];
        Random rand = new Random();
        for(int i = 0; i< arr.length; i++){
            arr[i] = rand.nextInt(46) + 55;
        }
        return arr;
    }
    public static ArrayList<Integer> randomIntSort(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rand = new Random();
        for(int i = 0; i< arr.length; i++){
            arr.add(rand.nextInt(46) + 55);
        }
        Collections.sort(arr);
        return arr;
    }
    public static String randomString(){
        Random rand = new Random();
        String[] alphabet = new String[26];
            alphabet[0] = "a";
            alphabet[1] = "b";
            alphabet[2] = "c";
            alphabet[3] = "d";
            alphabet[4] = "e";
            alphabet[5] = "f";
            alphabet[6] = "g";
            alphabet[7] = "h";
            alphabet[8] = "i";
            alphabet[9] = "j";
            alphabet[10] = "k";
            alphabet[11] = "l";
            alphabet[12] = "m";
            alphabet[13] = "n";
            alphabet[14] = "o";
            alphabet[15] = "p";
            alphabet[16] = "q";
            alphabet[17] = "r";
            alphabet[18] = "s";
            alphabet[19] = "t";
            alphabet[20] = "u";
            alphabet[21] = "v";
            alphabet[22] = "w";
            alphabet[23] = "x";
            alphabet[24] = "y";
            alphabet[25] = "z";
        String randString = "";
        for(int i = 0; i< 5; i++){
            randString += alphabet[rand.nextInt(26)];
        }
        return randString;
    }
    public static String[] randomStringTen(){
        Random rand = new Random();
        String[] alphabet = new String[26];
            alphabet[0] = "a";
            alphabet[1] = "b";
            alphabet[2] = "c";
            alphabet[3] = "d";
            alphabet[4] = "e";
            alphabet[5] = "f";
            alphabet[6] = "g";
            alphabet[7] = "h";
            alphabet[8] = "i";
            alphabet[9] = "j";
            alphabet[10] = "k";
            alphabet[11] = "l";
            alphabet[12] = "m";
            alphabet[13] = "n";
            alphabet[14] = "o";
            alphabet[15] = "p";
            alphabet[16] = "q";
            alphabet[17] = "r";
            alphabet[18] = "s";
            alphabet[19] = "t";
            alphabet[20] = "u";
            alphabet[21] = "v";
            alphabet[22] = "w";
            alphabet[23] = "x";
            alphabet[24] = "y";
            alphabet[25] = "z";
        String[] randStringArr = new String[10];
        for(int i = 0; i <10; i++){
            String randString = "";
            for(int j = 0; j< 5; j++){
                randString += alphabet[rand.nextInt(26)];
            }
            randStringArr[i] = randString;
        }
        return randString;
    }
}
