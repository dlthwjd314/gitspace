package UML2;

public class Stock {
	private int stockCount;

	public int getStockCount() {
		return stockCount;
	}

	public void setStockCount(int stockCount) { //<-getStockCount()-getSujuCount()
		if(stockCount == 0) {
			System.out.println("��� �����ϴ�. �ٸ� ��ǰ�� ������ �ּ���.");
			return;
		}
		this.stockCount = stockCount;
	}
	
}
