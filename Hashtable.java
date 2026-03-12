import java.util.*;

public class HashtableExample {

    public static void main(String[] args) {

        Hashtable<Integer,String> table = new Hashtable<>();

        table.put(1,"Java");
        table.put(2,"Python");
        table.put(3,"C++");

        System.out.println("Hashtable Elements:");

        for(Map.Entry<Integer,String> entry : table.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
