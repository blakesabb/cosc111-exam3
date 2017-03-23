
public class ItemStock 
{
	// Name of the store
	public String store;
	// Items in stock
	public int nstock;
	
	// Constructor
	ItemStock(String _store, int _nstock)
	{
		this.store = _store;
		this.nstock = _nstock;
	}
	
	// Give a string representation of the data in the class
	public String toString()
	{
		return store + ": " + nstock;
	}
}
