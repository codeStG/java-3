package concurrency;

class Reasoning extends Thread{
    //set up this class so it can become a valid thread.
    void distinguish() {
        //print to the console the difference between a thread and a process
        //print out you think will happen if you invoke the run() method of a thread as opposed to the start() method of a thread.
        System.out.println("A process is similar to an application that runs on a computer, while a thread is " +
                "comparable to the tasks that happen within those applications, simultaneously. A thread is a child " +
                "within the parent process.");
        System.out.println("Invoking the run() method of a thread simply invokes whatever code is within the run() " +
                "method of that Thread instance, but it does not actually start a thread.\n");
    }

    @Override
    public void run() {
        distinguish();
    }

}

