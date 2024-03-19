package gasbooking;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Delivery extends GasBooking {

    private String status;
    private String delPersonName = "";
    private String delPersonNumber = "";
    private int delOtp;
    private double amount;
    private double refund; // New field for refund
    private Date dt_1 = new Date();
    private Date dt_2 = new Date();

    public Delivery(String customerName, String area, String street, String mobile, String pinCode,
                    int numberOfCylinders, String delPersonNumber) {
        super(customerName, area, street, mobile, pinCode, numberOfCylinders);
        this.status = "booked"; // Default status when a new Delivery object is created
        this.delPersonNumber = delPersonNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDelPersonName() {
        return delPersonName;
    }

    public void setDelPersonName(String delPersonName) {
        this.delPersonName = delPersonName;
    }

    public String getDelPersonNumber() {
        return delPersonNumber;
    }

    public void setDelPersonNumber(String delPersonNumber) {
        this.delPersonNumber = delPersonNumber;
    }

    public int getDelOtp() {
        return delOtp;
    }

    public double getAmount() {
        return amount;
    }

    public double getRefund() {
        return refund;
    }

    public void setRefund(double refund) {
        this.refund = refund;
    }

    public Date getDt_1() {
        return dt_1;
    }

    public Date getDt_2() {
        return dt_2;
    }

    public void getLastDate() {
        // Assuming dt_2 is a Date attribute inherited from GasBooking
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(dt_2);
        System.out.println("Last Delivery Date: " + formattedDate);
    }

    public String getDates() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Booking Date: " + sdf.format(dt_1) + ", Delivery Date: " + sdf.format(dt_2);
    }

    public void setDeliveryPersonDetails() {
        System.out.println("Enter delivery person name: ");
        Scanner scanner = new Scanner(System.in);
        delPersonName = scanner.nextLine();
    }

    public void getdelpername() {
        System.out.println("Delivery Person Name: " + delPersonName);
    }

    public void amtcalc() {
        // Calculate amount based on the number of cylinders
        // Assuming each cylinder costs 50 units of currency
        double costPerCylinder = 50.0;
        amount = NumberOfCylinders * costPerCylinder;
        System.out.println("Amount calculated for " + NumberOfCylinders + " cylinders: " + amount);
    }

    public void verifyOtp() {
        // Verify OTP logic
        if (status.equals("booked")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter OTP: ");
            delOtp = scanner.nextInt();
            if (otp == delOtp) {
                System.out.println("Delivery successful.");
                status = "delivered";
            } else {
                System.out.println("OTP is incorrect. Delivery canceled.");
                status = "cancelled";
            }
        } else {
            System.out.println("Booking not found.");
        }
    }
}
