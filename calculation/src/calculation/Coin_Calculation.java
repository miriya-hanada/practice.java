package calculation;

public class Coin_Calculation {

	public static void main(String[] args) {

		int[] coincase = { 1, 0, 2, 2, 8, 1 };

		int[] jp_money = { 1, 5, 10, 50, 100, 500 };

		int money = 0;
		for (int i = 0; i < 6; i++) {
			money += coincase[i] * jp_money[i];
		}

		System.out.println("¬‘K‚Í" + money + "‰~‚ ‚è‚Ü‚·");

	}

}
