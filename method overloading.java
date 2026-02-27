class OverloadDemo {
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
    void add(double a, double b) {
        System.out.println("Sum = " + (a + b));
    }
    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        ob.add(10, 20);
        ob.add(2.5, 3.5);
        ob.add(1, 2, 3);
    }
}
