package UML;

public class sujuInfo {
	private int sujuCount;
	private int discount;
	
	public void registInfo(int sujuCount, int discount) {
		this.sujuCount = sujuCount;
		if(sujuCount%10 == 0) {
			this.discount = (int) (sujuCount * 0.1);
		}
	}
}
