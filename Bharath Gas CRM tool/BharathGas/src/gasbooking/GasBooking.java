package gasbooking;
import customers.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;;
public class GasBooking extends GasConnection{
	public double otp=234,amt=800,refund=0;
	public String dt,delDate,status,delMobileNO="123049756";
	public GasBooking(String customerName, String area, String street, String mobile, String pinCode,
			int numberOfCylinders) {
		super(customerName, area, street, mobile, pinCode, numberOfCylinders);
	}
	
	public Date dt_1=null;
	public Date dt_2=null;
	
	public void gatDate() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter booking date");
		dt=sc.nextLine();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd/mm/yyyy");
		try {
			dt_1=dateformat.parse(dt);
		} catch (ParseException e) {
			System.out.println("error "+e);
			e.printStackTrace();
		}
		System.out.println("enter delivery date");
		delDate=sc.next();
		try {
			dt_2=dateformat.parse(delDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long difference=dt_2.getTime()-dt_1.getTime();
		long newdifference=TimeUnit.DAYS.convert(difference,TimeUnit.MILLISECONDS);	
		if(newdifference>7) {
			status="pending";
		}
		
		
				}
	public void validate() {
		long abcd=dt_1.getTime()-lastdate.getTime();
		long diff=TimeUnit.DAYS.convert(abcd, TimeUnit.MILLISECONDS);
		
		System.out.println("difference between two dates is " +diff);
			
	
	if(NumberOfCylinders==1) {
		if(diff<30) {
			System.out.println("booking can not be done");
			status="cancelled";
		}else {
			status="booked";
			System.out.println("booking is done");
			lastdate=dt_1;
		}
	}
		else if(NumberOfCylinders==2) {
			if(diff<50) {
				System.out.println("booking can not be done");
				status="cancelled";
			}else {
				status="booked";
				System.out.println("booking is done");
				lastdate=dt_1;
			}
		}
	}
	}
	
	

