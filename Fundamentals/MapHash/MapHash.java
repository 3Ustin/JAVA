import java.util.HashMap;
import java.util.*;
import java.util.Set;

public class MapHash {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Hey Jude", "Beetles");
        userMap.put("StrawBerryFields forever", "Beetles");
        userMap.put("Lucy in the Sky with Diamonds", "Beatles");
        userMap.put("Sounds of Silence", "Simon and Garfunckles");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));    
        }
    }
}
