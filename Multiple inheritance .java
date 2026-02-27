interface A1 {
    void showA();
}

interface B1 {
    void showB();
}
class Demo implements A1, B1 {
    public void showA() {
        System.out.println("Interface A implemented");
    }
    public void showB() {
        System.out.println("Interface B implemented");
    }
}
class MultipleInheritance {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.showA();
        d.showB();
    }
}
