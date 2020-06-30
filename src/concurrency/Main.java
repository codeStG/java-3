package concurrency;

public class Main {
   
    public static void main(String[] args) {
         //run all of your threads from this main class.

        //Reasoning Thread
        Reasoning reasoningRunner = new Reasoning();
        reasoningRunner.start();

        //Team Thread
        Thread teamThread = new Thread(new TeamTC1());
        teamThread.start();

        //Sync Thread

    }
}