package snackBarApp;

public class Main
{
	public static void main(String[] args)
	{
		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		// System.out.println(jane.getName());
		// System.out.println(bob.getName());

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		// System.out.println(food.getId());
		// System.out.println(drink.getId());
		// System.out.println(office.getId());

		Snack chips = new Snack("chips", 1.75, 36, 1);
		Snack chocolateBar = new Snack("chocolate bar", 1.00, 36, 1);
		Snack pretzel = new Snack("pretzel", 2.00, 40, 1);
		Snack soda = new Snack("soda", 2.50, 24, 2);
		Snack water = new Snack("water", 2.75, 20, 2);

		int janeCount1 = 3;
		double janeCost1 = janeCount1 * soda.getCost();
		jane.buy(janeCost1);
		soda.buy(janeCount1);
		System.out.println(jane.getCash());
		System.out.println(soda.getQuantity());

		int janeCount2 = 1;
		double janeCost2 = janeCount2 * pretzel.getCost();
		jane.buy(janeCost2);
		pretzel.buy(janeCount2);
		System.out.println(jane.getCash());
		System.out.println(pretzel.getQuantity());

		int bobCount1 = 2;
		double bobCost1 = bobCount1 * soda.getCost();
		bob.buy(bobCost1);
		soda.buy(bobCount1);
		System.out.println(bob.getCash());
		System.out.println(soda.getQuantity());

		jane.addCash(10.00);
		System.out.println(jane.getCash());

		int janeCount3 = 1;
		double janeCost3 = janeCount3 * chocolateBar.getCost();
		jane.buy(janeCost3);
		chocolateBar.buy(janeCount3);
		System.out.println(jane.getCash());
		System.out.println(chocolateBar.getQuantity());

		System.out.println(pretzel.getQuantity());
		pretzel.setQuantity(12);
		System.out.println(pretzel.getQuantity());

	}
}
