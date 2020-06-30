package concurrency;

import java.util.ArrayList;
import java.util.List;

class TeamTC1 implements Runnable{

    List<String> team = new ArrayList<String>();

    //This thread should be created by implementing the Runnable interface, NOT by extending the Thread class.
    // In the run method of this thread, print out the name of each student in your TA group, (starting with your
    // TA).  There should be a pause of 1 second before each name is printed to the console.The name should then be
    // pushed to the team List  After all the names have been pushed to this List, print out the entire list of all
    // the students in your TA group. Don't forget your TA as well!  All of these steps should be done whenever the
    // thread is started.  (i.e. it can be done directly in the run()method of the thread itself).  Kick off the
    // thread in the Main class of the concurrency package.

    @Override
    public void run() {
        Thread.currentThread().setName("Team Semicolon");
        String[] arr = {"Dylan Fellows", "George Torres", "Jeramie Andrews", "John Kol", "Katherine Kim", "Kevin " +
                "Ibanez", "Vani Muppuru", "Nancy Golden", "Norita Sieffert", "Sabitha Radhakrishnan", "Victor Betts",
                "Vimala Murthy", "Jessica Ulysse", "Matthew Castiglione"};

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            team.add(arr[i]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + ": " + team);
    }

}