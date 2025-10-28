package week02.examples.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSet3 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");

        System.out.println(hashSet.size());
    }
}

