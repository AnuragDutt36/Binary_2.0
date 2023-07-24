public class MyDaemonThread extends Thread {
    @Override
    public void run() {
        // Daemon thread behavior here
        while (true) {
            // Do some background work or sleep
        }
    }

    public static void main(String[] args) {
        MyDaemonThread daemonThread = new MyDaemonThread();
        daemonThread.setDaemon(true); // Set the thread as daemon
        daemonThread.start(); // Start the daemon thread

        // Rest of the main program
        // ...
    }
}
