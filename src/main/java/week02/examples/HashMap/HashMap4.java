package week02.examples.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap4 {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(25500, "Red");
        hashMap.put(02550, "Green");
        hashMap.put(00255, "Blue");
        hashMap.clear();
        System.out.println(hashMap);
    }
}
