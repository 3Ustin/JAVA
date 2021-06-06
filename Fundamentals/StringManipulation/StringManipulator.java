public class StringManipulator{
    public static String trimAndConcat(String A,String B){
        String a = A.trim();
        String b = B.trim();
        String C = a + b;
        return C;
    }
    public static Integer getIndexOrNull(String A, char B){
        if(A.indexOf(B) != -1){
            int index = A.indexOf(B);
            return index;
        }
        else{
            return null;
        }
    }
    public static Integer getIndexOrNull(String A, String B){
        if(A.indexOf(B) != -1){
            return A.indexOf(B);
        }
        else{
            return null;
        }
    }
    public static String concatSubstring(String A, int one, int two, String B){
        String substring = A.substring(one, two);
        substring += B;
        return substring;
    }
}