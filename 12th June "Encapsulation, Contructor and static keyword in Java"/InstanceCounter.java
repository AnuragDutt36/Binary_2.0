public class InstanceCounter {
    private static int count = 0;

    public InstanceCounter() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        InstanceCounter instance1 = new InstanceCounter();
        System.out.println("Count: " + InstanceCounter.getCount()); // Output: Count: 1

        InstanceCounter instance2 = new InstanceCounter();
        System.out.println("Count: " + InstanceCounter.getCount()); // Output: Count: 2
    }
}
