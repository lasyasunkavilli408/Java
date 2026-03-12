// Producer Consumer Problem using synchronized methods

class SharedBuffer {

    int data;
    boolean available = false;

    synchronized void produce(int value) {

        while(available) {
            try { wait(); } catch(Exception e){}
        }

        data = value;
        System.out.println("Produced: " + data);

        available = true;
        notify();
    }

    synchronized void consume() {

        while(!available) {
            try { wait(); } catch(Exception e){}
        }

        System.out.println("Consumed: " + data);

        available = false;
        notify();
    }
}

class Producer extends Thread {

    SharedBuffer buffer;

    Producer(SharedBuffer buffer){
        this.buffer = buffer;
    }

    public void run(){

        for(int i=1;i<=5;i++){
            buffer.produce(i);
        }
    }
}

class Consumer extends Thread {

    SharedBuffer buffer;

    Consumer(SharedBuffer buffer){
        this.buffer = buffer;
    }

    public void run(){

        for(int i=1;i<=5;i++){
            buffer.consume();
        }
    }
}

public class ProducerConsumerExample {

    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}
