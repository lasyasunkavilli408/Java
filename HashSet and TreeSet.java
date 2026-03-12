import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        // HashSet
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);

        System.out.println("HashSet:");
        System.out.println(hashSet);

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);

        System.out.println("TreeSet (Sorted):");
        System.out.println(treeSet);
    }
}
