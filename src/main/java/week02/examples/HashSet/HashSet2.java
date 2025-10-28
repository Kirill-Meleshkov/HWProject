package week02.examples.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSet2 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}
