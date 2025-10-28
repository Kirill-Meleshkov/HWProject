package week02.examples.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList5 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("red");
        arrayList.add("green");
        arrayList.add("blue");

        System.out.println(arrayList);
        arrayList.set(1, "mint");
        System.out.println(arrayList);
    }
}
