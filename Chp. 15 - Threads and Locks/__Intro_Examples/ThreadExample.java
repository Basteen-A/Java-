<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package __Intro_Examples;

/* Code from online examples */
public class ThreadExample extends Thread {
    int count = 0;

    @Override
    public void run() {
        System.out.println("Thread starting.");
        try {
            while (count < 5) {
                Thread.sleep(500);
                System.out.println("In Thread, count is " + count);
                count++;
            }
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Thread terminating.");
    }
}
