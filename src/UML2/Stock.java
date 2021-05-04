package UML2;

public class Stock {
	private int stockCount;

	public int getStockCount() {
		return stockCount;
	}

	public void setStockCount(int stockCount) { //<-getStockCount()-getSujuCount()
		if(stockCount == 0) {
			System.out.println("재고가 없습니다. 다른 상품을 선택해 주세요.");
			return;
		}
		this.stockCount = stockCount;
	}
	
}
