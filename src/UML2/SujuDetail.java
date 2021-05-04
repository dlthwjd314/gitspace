package UML2;

public class SujuDetail {
	private int sujuCount;
	private int discount;
	
	public int getSujuCount() {
		return sujuCount;
	}

	public void setSujuCount(int sujuCount) {
		this.sujuCount = sujuCount;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		if(getSujuCount() % 10 ==0) { 
		this.discount = discount;
		}
	}	
}
