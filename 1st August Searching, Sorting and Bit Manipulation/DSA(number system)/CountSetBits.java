public class CountSetBits {
    public static int countSetBits(int number) {
        int count = 0;
        while (number > 0) {
            count += number & 1;
            number >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 19;
        System.out.println("Number of set bits in " + number + ": " + countSetBits(number));
    }
}
