import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        // HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(1,"Java");
        hashMap.put(2,"Python");
        hashMap.put(3,"C++");

        System.out.println("HashMap:");
        System.out.println(hashMap);

        // TreeMap
        TreeMap<Integer,String> treeMap = new TreeMap<>();

        treeMap.put(3,"Red");
        treeMap.put(1,"Blue");
        treeMap.put(2,"Green");

        System.out.println("TreeMap (Sorted):");
        System.out.println(treeMap);
    }
}
