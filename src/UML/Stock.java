package UML;

import java.util.HashMap;
import java.util.Random;

public class Stock {
	Items items = new Items();
	Random random = new Random();
	private HashMap stockCount = new HashMap();
	
	public HashMap getStockCount() {
		return stockCount;
	}
	public void setStockCount(HashMap stockCount) {
		this.stockCount.put(items.getItemName(), random.nextInt(10) );
	}
	
	
	
}
