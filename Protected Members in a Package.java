//Base Class
// File: pack2/Base.java

package pack2;

public class Base {

    // protected variable
    protected int number = 10;

    // protected method
    protected void display() {
        System.out.println("Protected number: " + number);
    }
}
//Derived Class
// File: TestProtected.java

import pack2.Base;

public class TestProtected extends Base {

    public static void main(String[] args) {

        TestProtected obj = new TestProtected();

        // Access protected member through subclass
        obj.display();
    }
}
