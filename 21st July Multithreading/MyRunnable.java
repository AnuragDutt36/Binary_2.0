public class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Daemon thread behavior here
        while (true) {
            // Do some background work or sleep
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread daemonThread = new Thread(myRunnable);
        daemonThread.setDaemon(true); // Set the thread as daemon
        daemonThread.start(); // Start the daemon thread

        // Rest of the main program
        // ...
    }
}
