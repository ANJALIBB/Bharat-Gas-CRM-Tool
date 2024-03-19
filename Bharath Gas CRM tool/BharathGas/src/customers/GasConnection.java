package customers;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GasConnection extends customers {
	
	public int NumberOfCylinders;
	String date;
	public Date lastdate=null;
	static int connectionNumber=100;//to access this var without  creating an object
	{
		connectionNumber++;
	}
	
	
	public GasConnection(String customerName, String area, String street, String mobile, String pinCode,
			int numberOfCylinders) {
		super(customerName, area, street, mobile, pinCode);
		NumberOfCylinders = numberOfCylinders;
	}
	//creating object of simpledateformat
	SimpleDateFormat dateformat=new SimpleDateFormat("dd/mm/yyyy");
	
	Scanner sc=new Scanner(System.in);
	public void getLastDate() {
		System.out.println("enter the date");
		date=sc.nextLine();
		try {
			lastdate=dateformat.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
