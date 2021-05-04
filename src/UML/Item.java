package UML;

import java.util.*;

public class Item {
	private static int itemCode;
	private static String itemName;
	private static int itemPrice;

	public Item(int itemCode, String itemName, int itemPrice) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	
	public static int getItemCode() {
		return itemCode;
	}

	public static String getItemName() {
		return itemName;
	}

	public static int getItemPrice() {
		return itemPrice;
	}

	public static void setItemCode(int itemCode) {
		Item.itemCode = itemCode;
	}

	public static void setItemName(String itemName) {
		Item.itemName = itemName;
	}

	public static void setItemPrice(int itemPrice) {
		Item.itemPrice = itemPrice;
	}


}
