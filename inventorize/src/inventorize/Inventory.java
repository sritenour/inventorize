package inventorizeApp.views;

public class Inventory {

	private String ID;
	private String name;
	private String title;
	private String qty;
	private String price;
	
	/**
	 * This Constructor is for when we initially create an item in the program.
	 * @param Id
	 * @param Name
	 * @param Title
	 * @param Qty
	 * @param Price
	 
	 */
	
	public Inventory(String id, String artistName, String artistTitle, String quantity, String itemPrice) 
	{
		setID(id);
		setName(artistName);
		setTitle(artistTitle);
		setQty(quantity);
		setPrice(itemPrice);
		
	}
	
	public void setID(String id)
	{
		this.ID = id;
		
	}
	public void setName(String artistName)
	{
		this.name = artistName;
	}
	
	public void setTitle(String artistTitle)
	{
		this.title = artistTitle;
	}
	
	public void setQty(String quantity)
	{
		this.qty = quantity;
	}
	
	public void setPrice(String itemPrice)
	{
		this.price = itemPrice;
	}
	
	public String getID(String id)
	{
		return this.ID;
		
	}
	public String getName(String artistName)
	{
		return this.name;
	}
	
	public String getTitle(String artistTitle)
	{
		return this.title;
	}
	
	public String getQty(String quantity)
	{
		return this.qty;
	}
	
	public String getPrice(String itemPrice)
	{
		return this.price;
	}
	
}

