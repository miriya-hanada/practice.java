package calculation;

public class Tax_Calculation {

	public static void main(String[] args) {

		int priceIncloudedtax = 0;
		int a = 1500;

		priceIncloudedtax = tax(a);

		System.out.println(a + "‰~‚Ì¤•i‚ÌÅ‰¿Ši‚Í" + (a + priceIncloudedtax) + "‰~iÁ”ïÅ‚Í" + priceIncloudedtax + "‰~)‚Å‚·B");

	}

	public static int tax(int price) {
		double taxRate = 0.08;
		return (int) (price * taxRate);
	}

}
