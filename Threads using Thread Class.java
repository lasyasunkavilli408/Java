// Creating threads by extending Thread class

class GoodMorning extends Thread {

    public void run() {

        while(true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000); // 1 second
            }
            catch(Exception e){}
        }
    }
}

class Hello extends Thread {

    public void run() {

        while(true) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000); // 2 seconds
            }
            catch(Exception e){}
        }
    }
}

class Welcome extends Thread {

    public void run() {

        while(true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(3000); // 3 seconds
            }
            catch(Exception e){}
        }
    }
}

public class ThreadExample {

    public static void main(String[] args) {

        GoodMorning t1 = new GoodMorning();
        Hello t2 = new Hello();
        Welcome t3 = new Welcome();

        t1.start();
        t2.start();
        t3.start();
    }
}
