package snackBarApp;

public class Customer
{
	private static int maxId = 0;
	private int id;
	private String name;
	private double cash;

	public Customer(String name, double cash)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.cash = cash;
	}

	public String getCash()
	{
		String customerCash = name + " has " + cash + " remaining.";
		return customerCash;
	}

	public void addCash(double cashAdded)
	{
		this.cash = cash + cashAdded;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void buy(double cost)
	{
		this.cash = cash - cost;
	}
}