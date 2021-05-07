package UML;

public class Items {
	private int itemCode;
	private String itemName;
	private int price;
	
	
	public int getItemCode() {
		return itemCode;
	}


	public String getItemName() {
		return itemName;
	}


	public int getPrice() {
		return price;
	}


	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "itemCode=" + itemCode + ", itemName=" + itemName + ", price=" + price;
	}
	

	
}
