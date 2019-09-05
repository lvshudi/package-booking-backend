package tws.entity;

import java.util.Date;

public class PackageInfo {
	private String packageId;
	private String customName;
	private String phoneNumber;
	private String status;
	private Date orderDate;
	public String getPackageId() {
		return packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public String getCustomName() {
		return customName;
	}
	public void setCustomName(String customName) {
		this.customName = customName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public PackageInfo(String packageId, String customName, String phoneNumber, String status, Date orderDate) {
		super();
		this.packageId = packageId;
		this.customName = customName;
		this.phoneNumber = phoneNumber;
		this.status = status;
		this.orderDate = orderDate;
	}
	public PackageInfo() {
		super();
	}
	
	
}
