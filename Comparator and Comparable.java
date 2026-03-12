import java.util.*;

class Student implements Comparable<Student>{

    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    // Sort by id
    public int compareTo(Student s){
        return this.id - s.id;
    }
}

public class ComparableExample{

    public static void main(String[] args){

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3,"John"));
        list.add(new Student(1,"Alice"));
        list.add(new Student(2,"Bob"));

        Collections.sort(list);

        for(Student s : list){
            System.out.println(s.id + " " + s.name);
        }
    }
}
