public class CoinChange {
	public static int coinChange(int amount, int[] coins) {

		int size = coins.length;
		int[][] arr = new int[size + 1][amount + 1];

		for (int i = 0; i < size + 1; i++) {
			arr[i][0] = 1;
		}
		for (int i = 1; i < size + 1; i++) {
			for (int j = 0; j < amount + 1; j++) {
				if (coins[i - 1] > j) {
					arr[i][j] = arr[i - 1][j];
				} else {
					arr[i][j] = arr[i][j - coins[i - 1]] + arr[i - 1][j];
				}
			}
		}
		return arr[size][amount];
	}

	public static void main(String[] args) {
		int amount = 5;
		int[] nums = { 1, 2, 5 };
		System.out.println("The desired output is : " + coinChange(amount, nums));
	}
}
