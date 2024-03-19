package customers;
import gassupplier.GasAgency;
public class customers implements GasAgency {
	private String CustomerName;
	private String area;
	private String street;
	private String CustomerMobile;
	private String pinCode;
	public customers(String customerName, String area, String street, String mobile, String pinCode) {
		super();
		this.CustomerName = customerName;
		this.area = area;
		this.street = street;
		this.CustomerMobile = mobile;
		this.pinCode = pinCode;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCustomerMobile() {
		return CustomerMobile;
	}
	public void setCustomerMobile(String customerMobile) {
		CustomerMobile = customerMobile;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	
	
	
	}
	


