package concurrency;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

class Sync extends Thread {
    List nums = new CopyOnWriteArrayList();

    Sync(String name) {
        super(name);
    }

    @Override 
    public void run() {
        Random rand = new Random();

        for(int i=0; i<100; i++) {
            int randInt = rand.nextInt(100);
            //I used the line below for testing
//            System.out.println(Thread.currentThread().getName() + ": " + i);
            this.nums.add(randInt);
        }
    }

    public static void main(String[] args)  {
        Sync syncThread = new Sync("sync thread 1");
        Sync syncThread2 = new Sync("sync thread 2");
        Sync syncThread3 = new Sync("sync thread 3");
        Sync syncThread4 = new Sync("sync thread 4");
        Sync syncThread5 = new Sync("sync thread 5");

        syncThread.start();
        syncThread2.start();
        syncThread3.start();
        syncThread4.start();
        syncThread5.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(syncThread.nums);
        //this prints out an empty list. write some code that will allow the data generated in the syncThread to show up  here.  There is a brute force way and a more sophisticated way.  Either or will work, but strive for sophistication :)

    }
    
}