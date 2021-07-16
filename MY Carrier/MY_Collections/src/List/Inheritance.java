package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item
{
	private String name;
	private double cost;
	static private int count;
	
	
	public Item(String name, double cost) {
		
		this.name = name;
		this.cost = cost;
		count++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Item.count = count;
	}
	
	public void displayDetails()
	{
		System.out.println("Item name : "+name);
		System.out.println("Price : "+cost);
	}

	@Override
	public String toString() {
		return "Item name=" + name + ", cost=" + cost ;
	}
	
}

class Fruits extends Item
{

	static private int count;
	
	Fruits(String name, double cost) {
		super(name, cost);
		count++;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Fruits.count = count;
	}	
}

class Vegetables extends Item
{

	static private int count;
	Vegetables(String name, double cost) {
		super(name, cost);
	count++;	
	}
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Vegetables.count = count;
	}	
}

class ItemBO 
{
	
	public static void searchByName(List<Item> list, String name)
	{
		
		list.forEach(x->System.out.println(x));
		for(Item li:list)
		{
			if(li.getName().equals(name))
			{
				System.out.println("Details of the item: ");
				System.out.println("Item name " +li.getName());
				System.out.println("Item cost "+ li.getCost());
			}
		}
	}
	
	public static void searchByCost(List<Item> list, double cost)
	{
		for(Item li:list)
		{
			if(li.getCost()==cost)
			{
				System.out.println("Details of the item: ");
				System.out.println("Item name " +li.getName());
				System.out.println("Item cost "+ li.getCost());
				System.out.println("Total fruit "+ Fruits.getCount());
				System.out.println("Total Vegetable "+ Vegetables.getCount());
				System.out.println("Total item "+ Item.getCount());
			}
		}
	}
}

public class Inheritance extends ItemBO{

	static List<Item> list=new ArrayList<Item>();
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
		System.out.println("1.Add Fruit");
		System.out.println("2.Add vegetable");
		System.out.println("3. Exit");
		
		System.out.println("Enter your choice");
		
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Item name");
			String name=sc.next();
			System.out.println("Price");
			double cost=sc.nextDouble();
			new Fruits(name,cost);
			Item it=new Item(name,cost);
			list.add(it);
			System.out.println(it.toString());
			break;
		case 2:
			System.out.println("Item name");
			String veg=sc.next();
			System.out.println("Price");
			double price=sc.nextDouble();	
			new Vegetables(veg,price);
			list.add(new Item(veg,price));
			System.out.println(list);
			break;
		case 3:
			break;
		}
		}
		for( Item li:list)
		{
		System.out.println(li);
		}
		System.out.println("Enter the name of the item to be searched");
		String item=sc.next();
		searchByName(list,item);
		
		System.out.println("Enter the cost of the item to be searched");
		double cost=sc.nextDouble();
		searchByCost(list,cost);
		
	}

}
