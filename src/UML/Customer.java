package UML;

public class Customer {
	private int customNum;
	private String customName;
	private String customAddr;
	private String customPhone;
	
	public int getCustomNum() {
		return customNum;
	}
	public String getCustomName() {
		return customName;
	}
	public String getCustomAddr() {
		return customAddr;
	}
	public String getCustomPhone() {
		return customPhone;
	}
	public void setCustomNum(int customNum) {
		this.customNum = customNum;
	}
	public void setCustomName(String customName) {
		this.customName = customName;
	}
	public void setCustomAddr(String customAddr) {
		this.customAddr = customAddr;
	}
	public void setCustomPhone(String customPhone) {
		this.customPhone = customPhone;
	}
	@Override
	public String toString() {
		return "Customer [customNum=" + customNum + ", customName=" + customName + "]";
	}
	
	
}
