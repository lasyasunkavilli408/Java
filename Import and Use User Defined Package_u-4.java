//Package Class:
// File: pack1/Message.java
// This class is inside a user-defined package

package pack1;

public class Message {

    public void showMessage() {
        System.out.println("Hello from User Defined Package!");
    }
}
//Main Class
// File: TestPackage.java
// Demonstrates importing and using a user-defined package

import pack1.Message;

public class TestPackage {

    public static void main(String[] args) {

        // Create object of class from package
        Message obj = new Message();

        // Call method
        obj.showMessage();
    }
}
