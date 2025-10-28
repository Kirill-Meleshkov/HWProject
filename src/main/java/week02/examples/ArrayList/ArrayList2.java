package week02.examples.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("red");
        arrayList.add("green");
        arrayList.add("blue");

        for (String s : arrayList){
            System.out.println(s);

        }
    }
}
