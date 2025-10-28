package week02.examples.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap3 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(25500, "Red");
        hashMap.put(2550, "Green");
        hashMap.put(255, "Blue");

        Map<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.putAll(hashMap);
        System.out.println(hashMap2);
    }
}
