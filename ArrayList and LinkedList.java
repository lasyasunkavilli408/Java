import java.util.*;

public class ListExample {

    public static void main(String[] args) {

        // ArrayList example
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        System.out.println("ArrayList Elements:");
        System.out.println(arrayList);

        // LinkedList example
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("LinkedList Elements:");
        System.out.println(linkedList);
    }
}
