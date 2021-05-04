package UML2;

public class Warehouse {
	private String warehouseName;
	private String warehouseAddr;
	private String warehousePhone;

	Warehouse(String warehouseName, String warehouseAddr, String sarehousePhone) {
		this.warehouseName = warehouseName;
		this.warehouseAddr = warehouseAddr;
		this.warehousePhone = sarehousePhone;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public String getWarehouseAddr() {
		return warehouseAddr;
	}

	public String getWarehousePhone() {
		return warehousePhone;
	}

//	public void setWarehouseName(String warehouseName) {
//		this.warehouseName = warehouseName;
//	}
//
//	public void setWarehouseAddr(String warehouseAddr) {
//		this.warehouseAddr = warehouseAddr;
//	}
//
//	public void setWarehousePhone(String warehousePhone) {
//		this.warehousePhone = warehousePhone;
//	}

}
