package snackBarApp;

public class Snack
{
	private static int maxId = 0;
	private int id;
	private String name;
	private double cost;
	private int quantity;
	private int vendingId;

	public Snack(String name, double cost, int quantity, int vendingId)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
		this.vendingId = vendingId;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getCost()
	{
		return cost;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public String getQuantity()
	{
		String snackQuantity = "There are " + quantity + " of " + name + " remaining";
		return snackQuantity;
	}

	public void setQuantity(int newQuantity)
	{
		this.quantity = quantity + newQuantity;
	}

	public int getVendingId()
	{
		return vendingId;
	}

	public void setVendingId(int vendingId)
	{
		this.vendingId = vendingId;
	}

	public void buy(int count)
	{
		this.quantity = quantity - count;
		double total = cost * count;
	}


}









