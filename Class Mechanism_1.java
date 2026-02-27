import java.util.Scanner;
class Person {
    String name;
    int age;
    String qualification;
    void personalDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    void qualificationDetails() {
        System.out.println("Qualification: " + qualification);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        System.out.print("Enter name: ");
        p.name = sc.nextLine();
        System.out.print("Enter age: ");
        p.age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter qualification: ");
        p.qualification = sc.nextLine();
        System.out.println("\n--- Personal Details ---");
        p.personalDetails();
        System.out.println("\n--- Qualification Details ---");
        p.qualificationDetails();
    }
}
