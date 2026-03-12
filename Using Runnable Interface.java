// Implementing threads using Runnable interface

class MessageThread implements Runnable {

    String message;
    int delay;

    MessageThread(String message, int delay){
        this.message = message;
        this.delay = delay;
    }

    public void run(){

        while(true){
            System.out.println(message);

            try{
                Thread.sleep(delay);
            }
            catch(Exception e){}
        }
    }
}

public class RunnableExample {

    public static void main(String[] args) {

        Thread t1 = new Thread(new MessageThread("Good Morning",1000));
        Thread t2 = new Thread(new MessageThread("Hello",2000));
        Thread t3 = new Thread(new MessageThread("Welcome",3000));

        t1.start();
        t2.start();
        t3.start();
    }
}
