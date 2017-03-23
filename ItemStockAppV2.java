
public class ItemStockAppV2 
{
	public static void main(String[] args)
	{
		// Location of Acme Inc. stores
		String[] stores = {"Novi", "Ann Arbor", "Canton", "Ypsilanti", "Westland", "Wayne", "Belleville", "Plymouth"};
		// Stock of AcmeProduct
		int[] stock = {10, 2, 7, 8, 15, 12, 5, 8};
		// Number that has been reserved
		int[] reserved = {2, 1, 1, 0, 3, 0, 0, 1};
		
		// Create an array of objects that track the items in stock and print them out
		ItemStock[] itemstocks = new ItemStock[stock.length];
		for (int i=0; i<itemstocks.length; i++)
		{
			itemstocks[i] = new ItemStock(stores[i], stock[i]);
			System.out.println(itemstocks[i].toString());
		}
	}
}
