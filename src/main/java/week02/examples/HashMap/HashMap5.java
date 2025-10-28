package week02.examples.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap5 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(25500, "Red");
        System.out.println(hashMap.isEmpty());
    }
}
