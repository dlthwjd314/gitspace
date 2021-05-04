package UML;

import java.util.*;

public class Customer {
	private String customCode;
	private String customName;
	private String customAddr;
	private String customPhone;
	
	public Customer(String customCode, String customName, String customAddr, String customPhone) {
		this.customCode=customCode;
		this.customName=customName;
		this.customAddr = customAddr;
		this.customPhone = customPhone;
		
	}
	
//	public Customer() {
//		this.customCode = customCode;
//		this.customName = customName;
//	}
	
	public String getCustomCode() {
		return customCode;
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

	public void setCustomCode(String customNum) {
		this.customCode = customNum;
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
		return " [°í°´¹øÈ£=" + customCode + ", °í°´¸í=" + customName + "]";
	}

}
