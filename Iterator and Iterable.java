import java.util.*;

public class IteratorExample {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Iterator to traverse collection
        Iterator<Integer> it = numbers.iterator();

        System.out.println("Using Iterator:");

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
