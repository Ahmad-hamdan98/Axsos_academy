import java.util.Set;
import java.util.HashMap;

public class HashMapp {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("song1", "jorge wasooof");
        userMap.put("song2", "wadeeea alsafie");
        userMap.put("song3", "baab al-hara");
        userMap.put("song4", "Ahmads hamdan song");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        System.out.println("                -------->           -------->            -------->             "+userMap.get("song1")); 
        for(String key : keys) {

            System.out.println(key+" "+userMap.get(key));    
        }
    }
}