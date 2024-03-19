package gassupplier;

public interface GasAgency {
	public String AgencyName="Bharath";
	public int AgencyCode=1234;
	public long poneNumber=1233567889;
	public int AgencyPincode=123;
	   default void show() {
		System.out.println("Agency name is "+AgencyName);
		System.out.println("Agency code is "+AgencyCode);
		System.out.println("Agency name is "+poneNumber);
		System.out.println("Agency name is "+AgencyPincode);
	}
}
